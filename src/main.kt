fun main() {
    //val = value : it is read-only immutable
    //var = variable: reassignable , mutable
    print("Enter first number")
    val a = readLine()!!.toInt()
    print("Enter second number")
    val b= readLine()!!.toInt()
    val c = add(a,b)
    //string interpolation
    println("Sum of $a and $b is $c")
    addAnother(a,b)
}
//Function with return type
fun add(a: Int, b: Int) : Int{
    return a + b
}

//function with no return type
fun addAnother(a: Int, b: Int){
    val c = a + b
    println("Sum of $a and $b is $c")
}