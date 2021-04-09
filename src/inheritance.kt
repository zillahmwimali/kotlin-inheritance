open class Person(val name:String,var age:Int){
    fun talk(words:String){
        println(words)
    }
    open fun eat(){
        println("Yum")
    }
    fun sleep(){
        println("Zzzzzz")
    }
    
}
class Treasurer( name:String, age:Int):Person(name, age){
   
    fun countMoney(notes:List<Int>):Int{
        var sum=0
        notes.forEach { notes->sum+=notes }
        return sum

    }
}
class Doctor( name: String,age:Int):Person(name, age){
    fun treatPatient(patient:String,disease:String){
        println("Treat $patient for $disease")
    }
    
}
class Farmer(name: String,age: Int):Person(name, age){
    override fun eat() {
        println("I eat vegetables planted in my garden ")
    }

    fun cultivateLand(){
        println("Harrow the land!")
    }
}

fun main() {
    var farmer=Farmer("Jane",67)
    farmer.eat()
    farmer.sleep()
    farmer.cultivateLand()
    farmer.talk("I practise mixed cropping but major in tea as a cash crop")

var doctor=Doctor("Cooper",41)
    doctor.eat()
    doctor.treatPatient("Hazina Montara","Anaemia")
}