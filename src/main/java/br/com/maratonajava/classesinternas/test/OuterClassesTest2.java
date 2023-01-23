package br.com.maratonajava.classesinternas.test;

public class OuterClassesTest2 {
    private String name = "Killua";

    void print(final String param) {
        class LocalClass {
            private String lastName = "Zoldick";

            public void readAttribute() {
                System.out.println(name + " " + lastName);
                System.out.println(param);
            }

        }
        new LocalClass().readAttribute();
    }

    public static void main(String[] args) {
        OuterClassesTest2 outerClasses = new OuterClassesTest2();
        outerClasses.print("Oi");
    }
}
