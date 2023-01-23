package br.com.maratonajava.classesinternas.test;

public class OuterClassesTest1 {
    private final String name = "Killua";

    class Inner {
        public void readAttributeOuterClass() {
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest1.this);
        }
    }


    public static void main(String[] args) {
        OuterClassesTest1 outerClass = new OuterClassesTest1();
        Inner inner = outerClass.new Inner();
        Inner inner2 = new OuterClassesTest1().new Inner();
        inner.readAttributeOuterClass();
    }
}
