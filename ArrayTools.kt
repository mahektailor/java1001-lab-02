fun main() {
    println(averageArray(arrayOf(1,2,3,4,5)))
}
fun averageArray(inputArray: Array<Int>): Double {
    // Creating Variable sum to find summation of array
    var sum = 0.0
    for (number in inputArray){
        sum +=number
    }
    return sum/inputArray.size
}