fun main(){
    print("Enter a number")
    val a = readLine()!!.toInt()
    multiple(a=a)

}

fun multiple(a: Int){
    for (i in 1..10){
        println("$a times $i is " + a*i)
    }
}