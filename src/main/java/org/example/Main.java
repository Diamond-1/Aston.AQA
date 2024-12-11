package org.example;


public class Main {
    public static void main(String[] args) {
        // Задание 1
        Worker worker = new Worker("Иванов Иван Иванович", "Тестировщик", "ivanov@mail.ru", "+ 375334567890 ", "350.23 тыс.руб", 54);
        worker.someInfo();
        // Задание 2
        Worker[] workArray = new Worker[5];
        workArray[0] = new Worker("Сергеев Сергей Сергеевич", "Инженер", "sergey@mail.ru", "+ 375334534590 ", "270.43 тыс.руб", 34);
        workArray[1] = new Worker("Антонов Антон Антонович", "Инженер", "sergey@mail.ru", "+ 375334534510 ", "70.43 тыс.руб", 26);
        workArray[2] = new Worker("Зубенко Михаил Петрович", "Директор", "mafiozi666@mail.ru", "+ 375334824550 ", "9 970.47 тыс.руб", 72);
        workArray[3] = new Worker("Паровозов Аркадий Аркадьевич", "Пожарный", "hero777@mail.ru", "+ 375334754590 ", "20.43 тыс.руб", 41);
        workArray[4] = new Worker("Голубенко Зинаида Павловна", "Уборщик", "noname@mail.ru", "+ 375331134580 ", "670.43 тыс.руб", 25);
        // Задание 3
        Park park = new Park();


    }


}
