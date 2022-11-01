import java.util.Scanner

fun main() {
    numberSum()
    getYearsAndMonths()
    getRectangleDiagonal()
}

//Task1
fun numberSum() {
    val scanner = Scanner(System.`in`)

    println("Пожалуйста, введите 3х значное число для получения суммы составляющих её чисел")
    print("-> ")
    var num = scanner.nextInt()

    var result = 0
    val base = 10
    val inputLength = num.toString().length

    for (i in 0 until inputLength) {
        val remainder = num % base
        result += remainder
        num /= base
    }

    println("Результат: $result")
}

//Task2
fun getYearsAndMonths() {
    val scanner = Scanner(System.`in`)

    println("Пожалуйста, введите желаемое количество минут для полуения количества лет и месяцев")
    print("-> ")
    val minutes = scanner.nextInt()

    val hours = minutes / 60
    val days = hours / 24
    val months = days / 30
    val years = months / 12f

    val yearsStr = String.format("%.1f", years)
    val yearsArr = yearsStr.split(",")

    if(yearsArr.size == 2){
        val resultYear = yearsArr[0]
        val resultMonth = yearsArr[1]

        println("Результат: $resultYear лет и $resultMonth месяцев")
    }
}

//Task3
fun getRectangleDiagonal() {
    val scanner = Scanner(System.`in`)

    println("Пожалуйста, введите 2 длины смежных сторон прямоугольника, для получения длины диагонали")

    println("Пожалуйста, введите длину первой стороны")
    print("-> ")
    val sideA = scanner.nextInt()

    println("Пожалуйста, введите длину второй стороны")
    print("-> ")
    val sideB = scanner.nextInt()

    val sideASquared = sideA.times(sideA)
    val sideBSquared = sideB.times(sideB)

    val rectangleDiagonal = sideASquared + sideBSquared

    println("Результат: $rectangleDiagonal")
}