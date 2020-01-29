package net.slipp.ncrash.kotlin.game.racing

data class Car(
    val name: String,
    var score: Int = 0
) {
    fun goStop() {
        val random = (0..9).random()

        if (random > 4) {
            score++
        }
    }

    override fun toString(): String {
        return "$name : ${"-".repeat(score)}"
    }
}