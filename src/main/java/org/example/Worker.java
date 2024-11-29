package org.example;

public class Worker {


    String FIO;
    String Role;
    String Email;
    String Phone;
    String Salary;
    int Age;


        public Worker( String _FIO, String _Role, String _Email, String _Phone, String _Salary, int _Age){
        System.out.println("Создан новй сотрудник");
        FIO = _FIO;
        Role = _Role;
        Email = _Email;
        Phone = _Phone;
        Salary = _Salary;
        Age = _Age;
    }

    public void someInfo(){
        System.out.println("ФИО: " + FIO + "\n" + "Должнлсть: " + Role + "\n" + "Email: " + Email + "\n" + "Телефон: " + Phone + "\n" + "Зарплата: " + Salary + "\n" + "Возраст: " + Age);
    }
}
