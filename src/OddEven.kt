fun main(){
    print("Enter a number")
    val num = readLine()!!.toInt()
    val oddeven = checkOddEven(num)
    print ("$num is $oddeven")
}

fun checkOddEven(num: Int) : String {
    val oddEven: String
    if(num % 2 == 0){
        oddEven = "Even"
    }
    else{
        oddEven = "Odd"
    }
    return oddEven
}