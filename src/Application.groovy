class ReadExistingFile {


    static final String FOLDER_PATH = System.in.newReader().readLine()

    static void main(String[] args) {
        println "Enter your path: " + FOLDER_PATH
        File folder = new File(FOLDER_PATH)
        if (!folder.exists()) {
            if (folder.mkdir()) {
                println("Directory is created!")
                File file = new File(FOLDER_PATH + "/test.txt")
                file.withWriter('utf-8') {
                    writer -> writer.writeLine 'Hello World'
                }
                file.append(" update file")
                file.append(" delete file")
                println file.text
                //file1.delete()
            } else {
                println("Directory is not exist!")
            }
        }


    }
}