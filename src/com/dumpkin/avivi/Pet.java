package com.dumpkin.avivi;

 abstract class Pet {
   private String name;

    public Pet(String name) {
        this.name = name;
    }

     public String getName() {
         return name;
     }

     public String whatDoseThePets(){
        return this.getClass().getSimpleName();
     }

     public abstract void petSay();
}
