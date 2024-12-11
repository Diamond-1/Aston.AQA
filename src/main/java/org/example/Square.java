package org.example;

public class Square implements Figura{
    private String zalivkaColor;
    private String borderColor;
    private int storona;
    private double perimeter;
    private double area;

    public Square(String zalivkaColor, String borderColor, int storona){
        this.zalivkaColor = zalivkaColor;
        this.borderColor = borderColor;
        this.storona = storona;
    }

    @Override
    public void Perimetr() {
        perimeter = 4 * storona;
    }

    @Override
    public void Area() {
        area = Math.pow(storona,2);
    }

    @Override
    public void showInfo() {
        System.out.println("Круг: Периметр - " + perimeter + ";" + " Площадь - " + area + ";" + " Цвет залвки - " + zalivkaColor + ";" + " Цвет границ - " + borderColor + ";");
    }
}
