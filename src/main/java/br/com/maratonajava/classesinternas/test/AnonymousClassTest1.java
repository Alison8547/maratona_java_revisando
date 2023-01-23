package br.com.maratonajava.classesinternas.test;

class Animal {
    public void print() {
        System.out.println("Animal walking");
    }
}

public class AnonymousClassTest1 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void print() {
                System.out.println("Modificado");
            }
        };

        animal.print();
    }
}
