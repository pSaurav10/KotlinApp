package KotlinBasic

fun main(){
    print("Enter a Number")
    val a = readLine()!!.toInt()
    factorial(a=a)
}

fun factorial(a: Int){
    var fact = 1
    for(i in 1..a){
        fact *= i
    }
    print("Factorial of $a is $fact")
}