package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b); //ошибка в том что y равен нулю. Я решил проблему с помощью обр-ки исключения
        int d = calc.multiply.apply(5,5);

        calc.println.accept(c);
        calc.println.accept(d);
    }
}
