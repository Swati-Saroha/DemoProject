class UserInputs {
    public static void main(String... s) {
        print "What is your name? "
        def name = System.in.newReader().readLine()
        println "Your name is " + name

        def name1 = System.console().readLine 'What is your name? '
        println "Your name is " + name1
    }
}