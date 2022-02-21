package ru.dw.homeworkkotlinpartone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import ru.dw.homeworkkotlinpartone.R
import ru.dw.newapplicationkotlinpart1.Employee
import ru.dw.newapplicationkotlinpart1.Repository
import ru.dw.newapplicationkotlinpart1.myLog

class MainActivity : AppCompatActivity() {
    private val allEmployee = Repository.getAllData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnClick()
        allEmployee()
        EmployeeWhen()



        val employee = Employee("Vasiliy",25)
        myLog("Имя " + employee.name + " возраст " + employee.age)

        val copyEmployee = employee.copy(age = 35)
        myLog(copyEmployee.toString())

    }

    private fun EmployeeWhen() {
        for (i in allEmployee){
            when(i.age){
                19-> myLog("19")
                23-> myLog("23")
                25-> myLog("25")
                31-> myLog("31")
            }
        }

    }


    private fun allEmployee() {
        for (i in allEmployee){
            myLog("Имя работник " + i.name + " его возраст " + i.age)
        }
    }

    private fun btnClick() {
        findViewById<Button>(R.id.btn).setOnClickListener {
            Toast.makeText(this, getString(R.string.click_success), Toast.LENGTH_SHORT).show()
        }
    }
}