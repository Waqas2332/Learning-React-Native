// All data types are objects in kotlin

/* class ClassName(
    constructor definition
){
    class definition
}
 */

class Employee(
    val name:String,
    var position:String
){
    var label:String = "New Label"; // if any property is defined in class body, it has to be initialized immediately
}


fun main(){
    val mark:Employee = Employee("Waqas","Manager") // created an object of employee class

    print(mark.label)
}