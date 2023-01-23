package br.com.maratonajava.classesinternas.test;

public class OuterClassesTest3 {
    private String nome = "Alison";

    static class Nested {
        private String lastNome = "Silva";

        public void print() {
            System.out.println(new OuterClassesTest3().nome + " " + lastNome);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest3.Nested nested = new OuterClassesTest3.Nested();
        nested.print();
    }
}
