import java.util.*

class Tests (var checkNumber: String, var checkName: Int, val comparingName: String, var checkStr: Int, var stringArray: Int, var numArr: Int, var taskNumber: Int) {
    fun nameHello () {
        print("Введите число")
        var checkNumber = Scanner(System.`in`).nextInt()
        if (checkNumber > 7)
            println("Привет")

    }
    fun whatName () {
        print("Введите имя")
        var checkName = Scanner(System.`in`).nextLine()
        val comparingName = "Вячеслав"
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
}
fun taskSelection() {
    println("Введите номер задачи: \n")
    val scanner = Scanner(System.`in`).nextLine()
    var taskNumber: Int = scanner.length()
    if (taskNumber == 1) {
        println("nameHello")
    } else if (taskNumber == 2) {
        println("whatName")
    } else if (taskNumber == 3) {
        println("arrCheck")
    } else {
        println("Нет такой задачи")
    }
}


