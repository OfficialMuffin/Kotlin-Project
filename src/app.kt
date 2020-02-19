fun main(args : Array<String>) {
    val user1 = University()
    user1.courseName.add("a) Computer Science")
    user1.courseName.add("b) Computer Networking")
    user1.courseName.add("c) Games Development")

    user1.coursePrerequisites.add("Maths - C")
    user1.coursePrerequisites.add("English - Level 2")
    user1.coursePrerequisites.add("ICT - C")

    println("Please choose from one of the following options: ")
    for (courses in user1.courseName)
        println(courses)

    println("Enter your choice: ")
    val charInput = readLine()!!

    when (charInput) {
        "a" -> {
            println("You have chosen: ${user1.courseName[0]}")
            println("For this course, you must have the following " +
                    "Prerequisites: ")
            for (p in user1.coursePrerequisites)
                println(p)
        }
        "b" -> {
            println("You have chosen: ${user1.courseName[1]}")
            println("For this course, you must have the following " +
                    "Prerequisites: ")
            for (p in user1.coursePrerequisites)
                println(p)
        }
        "c" -> {
            println("You have chosen: ${user1.courseName[2]}")
            println("For this course, you must have the following " +
                    "Prerequisites: ")
            for (p in user1.coursePrerequisites)
                println(p)
        }
        else -> println("Invalid Input")
    }
}