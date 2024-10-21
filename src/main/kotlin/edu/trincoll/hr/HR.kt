package edu.trincoll.hr

// The HR class should have:
//   - a list of employees
//   - a hire method that takes an employee and returns a new HR object with that employee added
//   - a fire method that takes an id and returns a new HR object with the employee with that id removed
//   - a payEmployees method that returns the total pay of all employees
class HR(private val employees: List<Employee> = emptyList()) {

    fun hire( employee: Employee): HR{
        val employeeUpdated = employees + employee
        return HR (employeeUpdated)
    }
    // new method fired that uses id number to fire employee
    fun fire (id: Int): HR{
        return HR(employees - employees[id])
    }


    fun payEmployees(): Double {
        var intotal = 0.0
        for (employee in employees){
            intotal += employee.pay()
        }
        return intotal  // Convert pay to Int
    }

    override fun toString(): String {
        return "HR(employees=$employees)"
    }
}