package test211208;

import java.util.ArrayList;

//1------------------------------------------------------------//
/*class Rectangle {
    public int x, y, width, height;
    // 기본 생성자
    Rectangle() {
        this(3, 2, 1, 0);
        System.out.println("기본 생성자 호출");
    }
    //생성자 오버로딩
    Rectangle(int x, int y) {
        this();
        System.out.println("2개짜리 생성자 호출");
    }
    Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        System.out.println("4개짜리 생성자 호출");
    }
}*/
//2------------------------------------------------------------//
/*class Person {
    static int population;
    Person(String name) {
        System.out.println(name + " is born.");
        population++;
    }
     static String get_population() {
         return population + "명";
    }
}*/
//3------------------------------------------------------------//
/*class Person {
    boolean head = true;
    void walk() {
        System.out.println("걷기");
    }
}
class Man extends Person {
    void run() {
        System.out.println("달리기");
    }
}
class Woman extends Person {
    void jump() {
        System.out.println("점프");
    }
}*/
//4------------------------------------------------------------//
/*class Car {
    String color;
    Car() {}
    Car(String color) {
        this.color = color;
    }
}
class SportsCar extends Car {
    int speedLimit;

    SportsCar(String color, int speedLimit) {
        super(color);
        this.speedLimit = speedLimit;
    }
}*/
//5------------------------------------------------------------//
/*class Animal {
    void jump(String b) {
        System.out.println("jump");
    }
}

class Dog extends Animal {
    void jump() {
        System.out.println("jump X2");
    }
}*/
//ex------------------------------------------------------------//
class Bank {
    void getInterestRate(int money) {
        System.out.println("Bank의 method");
    }
}
class BadBank extends Bank {
    @Override
    void getInterestRate(int money) {
        System.out.println(money + "원의 BadBank의 이자 = " + money * 0.03);
    }
}
class NormalBank extends Bank {
    @Override
    void getInterestRate(int money) {
        System.out.println(money + "원의 NormalBank의 이자 = " + money * 0.05);

    }
}
class GoodBank extends Bank {
    @Override
    void getInterestRate(int money) {
        System.out.println(money + "원의 GoodBank의 이자 = " + money * 0.1);

    }
}
public class Test211227 {
    public static void main(String[] args) {
        //1------------------------------------------------------------//
/*        Rectangle r = new Rectangle(2, 4);
        System.out.println(r.x);
        System.out.println(r.y);
        System.out.println(r.width);
        System.out.println(r.height);*/
        //2------------------------------------------------------------//
/*        Person man = new Person("james");
        Person woman = new Person("emily");
        System.out.println("전체 인구수 = " + Person.get_population());*/
        //3------------------------------------------------------------//
/*        Person person = new Person();
        Man man = new Man();
        Woman woman = new Woman();
        System.out.println(man.head);
        man.walk();
        man.run();
        woman.jump();*/
        //4------------------------------------------------------------//
/*        SportsCar sportsCar = new SportsCar("red", 300);
        System.out.println(sportsCar.color);
        System.out.println(sportsCar.speedLimit);*/
        //5------------------------------------------------------------//
/*        Dog dog1 = new Dog();
        dog1.jump();
        dog1.jump("test");*/
        //ex------------------------------------------------------------//
        GoodBank goodBank = new GoodBank();
        NormalBank normalBank = new NormalBank();
        BadBank badBank = new BadBank();

        goodBank.getInterestRate(200);
        normalBank.getInterestRate(200);
        badBank.getInterestRate(200);

    }
}
