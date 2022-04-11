fun myMenu(title: String, optionsList: List<String>): Int {
    println("******$title******")
    var i = 1
    for (elem in optionsList) {
        println("$i -> $elem")
        i++
    }
    println("0 -> Esci")
    return readIntWithMinAndMax("Select an option: ", 0, optionsList.size)
}