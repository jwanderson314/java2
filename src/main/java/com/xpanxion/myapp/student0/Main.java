package com.xpanxion.myapp.student0;

public class Main {
    public static void main(String[] args) {

        ex3();

    }

    private static void ex3() {
        var calculator =  new Calculator();
        var result1 = calculator.add(1, 2);
        var result2 = calculator.subtract(4, 2);
        var result3 = calculator.divide(10, 5);
        var result4 = calculator.multiply(2, 2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(calculator.getHistory());
    }

    private static void ex2() {
        var n1 = new AwesomeNumber(4);
        var n2 = new AwesomeNumber(2);
        var result1 = AwesomeNumber.add(n1, n2);
        var result2 = AwesomeNumber.subtract(n1, n2);
        System.out.println(result1);
        System.out.println(result2);
    }

    private static void ex1() {
        var p1 = new Person();
        var p2 = new Person("Jon", "Smith");
        var p3 = new Person("Mary", "Jane", (byte) 12, 123456789);

        System.out.println(p1.speak());
        System.out.println(p2.speak());
        System.out.println(p3.speak());

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("Person count: " + Person.getPersonCount());
    }

}

