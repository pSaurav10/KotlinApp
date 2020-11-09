package KotlinBasic

fun main(){
    print("Enter the rate of Interest")
    val rate = readLine()!!.toFloat()
    print("Enter the Principal amount")
    val amount = readLine()!!.toFloat()
    print("Enter the time")
    val time = readLine()!!.toFloat()
    val interest = SI(amount, time, rate)
    print("simple interest of $amount, in time $time with rate $rate is $interest")
}

fun SI(p: Float, t: Float, r: Float): Float{
    return (p*t*r)/100
}