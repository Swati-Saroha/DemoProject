class Practice {

    static void main(String... s) {
        File folder = new File("/home/ongraph/Documents/folder1/")
        String fileName = "test.txt"
        if (folder.exists() && folder.isDirectory()) {
            println "Folder already exists"
        }
        if (!folder.mkdirs()) {
            println(folder.canRead())
            println(folder.canWrite())
            println(folder.canExecute())
        }

        File file = new File(folder.absolutePath + '/' + fileName)
        file.createNewFile()
        file.append("Testing testing....\n 1. One\n2.Two\n3.Three")
        file.append('')
        println(file.eachLine {
            println(it)
        })
        println 4 + 6
        println 4.plus(6)

    }

}
