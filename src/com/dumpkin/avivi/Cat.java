package com.dumpkin.avivi;

class Cat extends Pet {

    private int age;

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }


    @Override
    public void petSay() {
        System.out.printf("%d years old cat  %s say: \n", age, super.getName());
        System.out.println(" /\\_/\\\n" +
                "( o.o )   Mrr! Meaw!\n" +
                " > ^ <");
    }
}
