package ru.dw.newapplicationkotlinpart1

object  Repository{


    fun getAllData():List<Employee>{
        val employeeList = ArrayList<Employee>()
        employeeList.add(Employee("Dmitriy",19))
        employeeList.add(Employee("Alex",23))
        employeeList.add(Employee("Alexandr",25))
        employeeList.add(Employee("Vasiliy",31))
        return employeeList
    }
}