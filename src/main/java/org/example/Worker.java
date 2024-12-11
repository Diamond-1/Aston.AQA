package org.example;

public class Worker {

    private String fio;
    private String role;
    private String email;
    private String phone;
    private String salary;
    private int age;

    public Worker(String fio, String role, String email, String phone, String salary, int age) {
        System.out.println("Создан новй сотрудник");
        this.fio = fio;
        this.role = role;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void someInfo() {
        System.out.println("ФИО: " + fio + "\n" + "Должнлсть: " + role + "\n" + "Email: " + email + "\n" + "Телефон: " + phone + "\n" + "Зарплата: " + salary + "\n" + "Возраст: " + age);
    }
}
