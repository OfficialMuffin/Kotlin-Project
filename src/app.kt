fun main(args : Array<String>) {
    var user1 = University()
    user1.courseName.add("a) Computer Science")
    user1.courseName.add("b) Computer Networking")
    user1.courseName.add("c) Games Development")

    println("Please choose from one of the following options: ")
    for (courses in user1.courseName)
        println(courses)

    try {
        println("Enter your choice: ")
        val charInput = readLine()!!

        if (charInput == "a")
            println("You have chosen: ${user1.courseName[0]}")
        else if (charInput == "b")
            println("You have chosen: ${user1.courseName[1]}")
        else if (charInput == "c")
            println("You have chosen: ${user1.courseName[2]}")
        else
            println("Invalid Input")
    } catch (e: Exception) {
        println("Invalid Input")
    }

}