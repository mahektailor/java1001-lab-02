fun main() {
    averageArrayTester()
    // MAKING MULTIPLE ARRRY
    val array1 = arrayOf(1, 2, 3, 4, 5)
    // created array 2
    val array2 = arrayOf("apple", "banana", "cherry")
    // created array 3
    val array3 = arrayOf(0.5, 1.5, 2.5)

    // new variable to SearchValue for string "3" in array numbers
    val searchValue1 = 3
    // variable contains
    val containsValue = arrayContains(array1, searchValue1)
    println("Array contains $searchValue1: $containsValue")
    // new variable to SearchValue for string "3" in array numbers
    val searchValue2 = "apple"
    val containsValue2 = arrayContains(array2, searchValue2)
    println("Array contains $searchValue2: $containsValue2")

    val reversed1 = reverseArray(array1)
    val reversed2 = reverseArray(array2)
    val reversed3 = reverseArray(array3)

    println("Reversed Array 1: ${reversed1.contentToString()}")
    println("Reversed Array 2: ${reversed2.contentToString()}")
    println("Reversed Array 3: ${reversed3.contentToString()}")
    //
}

fun averageArray(inputArray: Array<Int>): Double {
    // Creating Variable sum to find summation of array
    var sum = 0.0
    for (number in inputArray) {
        sum += number
    }
    return sum / inputArray.size
}

fun averageArrayTester() {

    print("this average of sum of array 1 :")
    println(averageArray(arrayOf(1, 2, 3, 4, 5)))
    print("this average of sum of array 2 :")
    println(averageArray(arrayOf(2, 3, 4, 5)))
    print("this is sum of null array  :")
    println(averageArray(arrayOf()))
}
// added function arryContains to check if that is present or not
// using boolen to return answer true or false
fun <T> arrayContains(array: Array<T>, searchValue: T): Boolean {
    return searchValue in array
}

fun <T> reverseArray(array: Array<T>): Array<T> {
    // new variable to find reverse of array
    // making duplicate of arry by using copyOF()
    val reversedArray = array.copyOf()

    val mid = array.size / 2
    // found midpoint of array
    // creating a for loop till middle of array
    for (i in 0 until mid) {
        // temporay variable to store array reversed
        val temp = reversedArray[i]
        /*The value at index i is then replaced with the value at
        the corresponding index from the end of the array
         (array.size - i - 1). This effectively swaps the elements,
         moving the element at the beginning of the array to the end
         and vice versa.*/
        reversedArray[i] = reversedArray[array.size - i - 1]
        reversedArray[array.size - i - 1] = temp
    }

    return reversedArray
}
