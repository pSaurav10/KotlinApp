package KotlinBasic

fun main(){
    print("Enter Radius of the circle")
    val r = readLine()!!.toFloat()
    val area = calArea(r=r)
    print("Area of circle is $area")
}

fun calArea(pi: Float = 3.14F, r : Float) :Float{
    return pi*r*r
}