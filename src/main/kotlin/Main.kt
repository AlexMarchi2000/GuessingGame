import kotlin.random.Random

fun main() {
    val min = 0
    val max = 100
    val attempts = 5

    while (true) {
        val choise = myMenu("Guessing Game", listOf("Gioca"))
        if (choise == 0) return
        val cpuGuess = Random.nextInt(min, max)
        var remainingAttempts = attempts
        while (true) {
            if (remainingAttempts == 0) {
                println("Hai perso...")
                break
            }
            println("Tentativi rimanenti: $remainingAttempts")
            val userGuess = readIntWithMinAndMax("Prova ad indovinare a che numero sto pensando: ", min, max)
            when {
                userGuess == cpuGuess -> {
                    println("Hai vinto!!")
                    break
                }
                userGuess < cpuGuess -> println("Troppo basso...")
                userGuess > cpuGuess -> println("Troppo alto...")
            }
            remainingAttempts--
        }
    }
}