package org.example;

/*
    BMI:
    18,5 <= BMI <= 24,9
    wzór:

    bmi = masa / (wzrost * wzrost)
    Wzrost w metach np. 1.8

    Math.pow(a, b) pamiętaj że zwraca double, potrzebna konwersja
    a do potęgi b
    Zaprezentuj w konsoli wynik bmi

    na koniec skonwertuj wynik na liczbę całkowitą
 */
public class Main {
    public static void main(String[] args) {
        double weight = 70;
        float height = 1.75f;
        double bmi = weight/Math.pow(height,2);
        System.out.println("BMI: " + (int)bmi);
    }
}