package net.slipp.ncrash.kotlin.game.racing

import java.util.*

fun main() {
    val reader = Scanner(System.`in`)

    println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
    val carNameInput = reader.next()!!

    println("시도할 회수는 몇회인가요?")
    val loopCount = reader.nextInt()

    val carNames = carNameInput.split(",").toTypedArray()

    val cars = mutableListOf<Car>()
    for (carName in carNames) {
        require(carName.isNotBlank()) {"자동차 이름 입력하세요!"}
        require(carName.length < 6) {"자동차 이름은 5자 이하만 가능!"}

        cars.add(Car(name = carName))
    }

    println("실행 결과")

    repeat(loopCount) {
        for (car in cars) {
            car.goStop()
            println(car)
        }
        println()
    }

    val maxScore = cars.map { it.score }.max() ?: 0
    val winnerName = cars.filter { it.score == maxScore }.joinToString { it.name }

    println("${winnerName}가 최종 우승했습니다.")
}