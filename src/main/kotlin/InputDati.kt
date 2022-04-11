fun readString(message: String): String {
    print(message)
    return readln()
}

fun readStringNotEmpty(message: String): String {
    print(message)
    while (true) {
        val s = readln()
        if (s.isEmpty())
            println("You cannot leave empty")
        else
            return s
    }
}


fun readInt(message: String): Int {
    print(message)
    while (true) {
        val s = readln()
        if (s.toIntOrNull() == null)
            println("This is not a number")
        else
            return s.toInt()
    }
}

fun readIntWithMinAndMax(message: String, min: Int, max: Int): Int {
    print(message)
    while (true) {
        val n = readln()
        if (n.toIntOrNull() == null)
            println("This is not a number")
        else
            when {
                n.toInt() < min -> println("Insert a number between $min and $max")
                n.toInt() > max -> println("Insert a number between $min and $max")
                else -> return n.toInt()
            }
    }
}

fun readYesOrNo(message: String): Boolean {
    print("$message [Y/N]: ")
    while (true) {
        val s = readln()
        when (s.uppercase()) {
            "Y" -> return true
            "N" -> return false
            else -> println("Insert Y or N")
        }
    }
}