package array

fun main(args: Array<String>){
    val arr = arrayOf<Int>(1,4,6,7,8,99,12,3,23)
    var a = 0
    for (i in arr){
        if(i % 2 == 1){
            a += i
        }
    }
    print("Sum of odd numbers is $a")
}