fun main() {
  averageArrayTester()
 
}
fun averageArray(inputArray: Array<Int>): Double {
    // Creating Variable sum to find summation of array
    var sum = 0.0
    for (number in inputArray){
        sum +=number
    }
    return sum/inputArray.size
}
fun averageArrayTester(){
    
    print("this average of sum of array 1 :")
    println(averageArray(arrayOf(1,2,3,4,5)))
    print("this average of sum of array 2 :")
    println(averageArray(arrayOf(2,3,4,5)))
    print ("this is sum of null array  :")
    println(averageArray(arrayOf()))
}

