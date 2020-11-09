package KotlinBasic//iot
//        android
//        webapi
//
//        0-39 fail
//        40-49 3rd div
//        50-59 2nd div
//        60-100 1st div

        fun main(){
                print("Enter KotlinBasic.marks obtained in IoT")
                val iot = readLine()!!.toFloat()
                print("Enter KotlinBasic.marks obtained in Android")
                val android = readLine()!!.toFloat()
                print("Enter KotlinBasic.marks obtained in WebAPI")
                val webapi = readLine()!!.toFloat()
                val result = marks(iot, android, webapi)
                print(result)
        }

        fun marks(iot: Float, android: Float, webapi: Float) : String{
                val percentage = (iot + android + webapi)/300 * 100
                val result: String
                if (percentage>60){
                        result =  "The student has obtained $percentage % and first division"
                }
                else if (percentage>50 && percentage<60){
                        result = "The student has obtained $percentage % and second division"
                }
                else if (percentage>40 && percentage<50){
                        result = "The student has obtained $percentage % and third division"
                }
                else{
                        result = "The student has obtained $percentage % and has failed"
                }
                return result
                }
