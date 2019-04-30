//завдання 1:
//Створити клас MyMath. В ньому створити 2-3 константи і 3-4 статичні методи.
//Константи і методи повинні бути математичного характеру.
//Визвати константи і статичні методи в методі main

//завдання 2:
//Написати клас абстрактний Pet , в якому описати абстрактний метод voice().
//Створити класи Cow, Cat, Dog , які наслідуються від Pet. Перевизначити в них метод
//voice(), так, щоб викликаючи його в методі main, на консоль виводилось :
//“Я кіт-Мяууу-Мяууу”, “Я пес- Гаууу-Гаууу”, “Я корова- Мууу-Мууу”.

package com.dumpkin.avivi;

public class Main {

    public static void main(String[] args) {

        // Exercise 1 _________________________________________________

        System.out.println("divide 34.6/235: " + MyMath.divide(34.6, 235d));
        System.out.println("substract 34-47: " + MyMath.subtract(34, 47));
        System.out.println("mutliply 255x255: " + MyMath.mult(256, 256));
        System.out.println("summ 444+222: " + MyMath.sum(444, 222));
        System.out.println("constant PI is " + MyMath.PI);
        System.out.println("constant Euler's number is " + MyMath.E);
        //____________________________________________________________

        // Exercise 2 _________________________________________________
        System.out.println("\n\n");
        Cow cow1 = new Cow("Zirka", "brown");
        System.out.printf("What dose the %s say?\n",cow1.whatDoseThePets());
        cow1.petSay();

        System.out.println("\n\n");
        Cat kitty= new Cat("Murzik",5);
        System.out.printf("What dose the %s say?\n",kitty.whatDoseThePets());
        kitty.petSay();


        System.out.println("\n\n");
        Dog pes= new Dog("Jack",3,"doberman");
        System.out.printf("What dose the %s say?\n",pes.whatDoseThePets());
        pes.petSay();
    }
}
