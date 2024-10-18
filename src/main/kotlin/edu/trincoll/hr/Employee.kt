package edu.trincoll.hr

// Abstract class Employee should have:
//   - a name of type String
//   - an id of type Int.
// It should implement the Comparable interface with the
// compareTo method.
//
// It should include an abstract method pay()
// that returns a Double.
//
// It should override the toString method to
// return a string with the name and id of the employee.

//abstract class employee with value name as string and id as int
abstract class Employee(val name: String, val id: Int): Comparable<Employee> {

    // abstract method pay() returns double
    abstract fun pay(): Double

    //implementing compareTo method
    override fun compareTo(other: Employee): Int {
        return this.id.compareTo(other.id)
    }

    //override tostring to return a string
    override fun toString(): String{
        return "Employee: (name= $name, id=$id)"
    }

}