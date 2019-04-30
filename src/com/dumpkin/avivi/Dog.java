package com.dumpkin.avivi;

class Dog extends Pet {

    private int age;
    private String race;

    public Dog(String name, int age, String race) {
        super(name);
        this.age = age;
        this.race=race;
    }


    @Override
    public void petSay() {
        System.out.printf("%d years old %s  %s say: \n", age,race, super.getName());
        System.out.println("   / \\__\n" +
                "  (    @\\___\n" +
                "  /         O     Bouw! Bouw!\n" +
                " /   (_____/\n" +
                "/_____/   U");
    }
}
