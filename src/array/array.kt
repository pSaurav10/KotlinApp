package array

fun main(args: Array<String>){
    val arr = arrayOf<Int>(1,2,3,4)
//    for(i in 0 until arr.size){
//        println(arr[i])
//    }
    for (i in arr.indices){
        println(arr[i])
    }
}

