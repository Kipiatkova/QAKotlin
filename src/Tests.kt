import java.util.*

fun nameHello(): Int {
    print("Введите число")
    val checkNumber = Scanner(System.`in`).nextInt()
    if (checkNumber > 7)
        println("Привет")
    return checkNumber

}

fun whatName() {
    print("Введите имя")
    val checkName = Scanner(System.`in`).nextLine()
    val comparingName = "Вячеслав"
    if (comparingName.equals("Вячеслав", ignoreCase = true) || comparingName.equals("вячеслав", ignoreCase = true))
    if (checkName == comparingName)
            println("Привет, Вячеслав")
        else
            println("Нет такого имени")

}

    fun arrCheck (){
        println("Введите число")
        var checkStr = Scanner(System.`in`).nextLine()
        var stringArray: List<String> = checkStr.split("")
        var numArr: Int = stringArray.size
        if (numArr % 3 == 0) {
            println(numArr)
        }
    }

fun taskSelection() {
    println("Введите номер задачи: \n")
    val scanner = Scanner(System.`in`).nextLine()
    val taskNumber: List<String> = scanner.split("")
    val number: Int = taskNumber.size
    when (number) {
        1 -> {
            nameHello()
        }
        2 -> {
            whatName()
        }
        3 -> {
            arrCheck()
        }
        else -> {
            println("Нет такой задачи")
        }
    }

}







