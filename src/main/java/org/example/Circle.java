package org.example;

public class Circle implements Figura{
    private String zalivkaColor;
    private String borderColor;
    private double Pe = 3.14;
    private int radius;
    private double perimeter;
    private double area;

    public Circle(String zalivkaColor, String borderColor, int radius){
        this.zalivkaColor = zalivkaColor;
        this.borderColor = borderColor;
        this.radius = radius;
    }

    @Override
    public void Perimetr() {
        perimeter = 2 * Pe * radius;
    }

    @Override
    public void Area() {
        area = Pe * Math.pow(radius,2);
    }

    @Override
    public void showInfo() {
        System.out.println("Круг: Периметр - " + perimeter + ";" + " Площадь - " + area + ";" + " Цвет залвки - " + zalivkaColor + ";" + " Цвет границ - " + borderColor + ";");
    }
}
