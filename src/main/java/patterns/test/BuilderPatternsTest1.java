package patterns.test;

import patterns.dominio.Person;

public class BuilderPatternsTest1 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firstName("Alison")
                .lastName("Silva")
                .nickName("Mago")
                .email("Alison@hotmail.com")
                .build();

        System.out.println(build);
    }
}
