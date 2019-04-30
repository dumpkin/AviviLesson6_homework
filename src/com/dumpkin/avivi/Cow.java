package com.dumpkin.avivi;

class Cow extends Pet {

    private String color;

    public Cow(String name, String color) {
        super(name);
        this.color = color;
    }


    @Override
    public void petSay() {
        System.out.printf("%s cow  %s say: \n", color, super.getName());
        System.out.println("             (__)    \n" +
                "     `\\------(oo)   Moo! Moo!\n" +
                "       ||    (__)\n" +
                "       ||w--|| ");
    }
}
