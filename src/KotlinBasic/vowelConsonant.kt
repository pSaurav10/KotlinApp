package KotlinBasic

fun main(){
    print("enter a character")
    val a = readLine()!![0]
    checkCharusingWhen(a)

}

fun checkCharacter(a : Char){
    val char : String
    if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
        char = "Vowel"
    }
    else{
        char = "Consonant"
    }
    print("$a is $char")
}

fun checkCharusingWhen(a: Char){
    when(a){
       'a','e','i','o','u' ->
           println("Vowel")
        else ->
            print("Consonant")
    }
}