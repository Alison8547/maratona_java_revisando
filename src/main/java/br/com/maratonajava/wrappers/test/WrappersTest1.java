package br.com.maratonajava.wrappers.test;

public class WrappersTest1 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 9;
        int intP = 10;
        char charP = 'A';
        long longP = 130L;
        double doubleP = 38.4d;
        float floatP = 88.88f;
        boolean booleanP = true;


        Byte byteW = 1;
        Short shortW = 9;
        Integer intW = 10;  // autoboxing
        Character charW = 'A';
        Long longW = 130L;
        Double doubleW = 38.4d;
        Float floatW = 88.88f;
        Boolean booleanW = true;

        int i = intW; // unboxing

        int parseInt = Integer.parseInt("12");
        System.out.println(parseInt);

        boolean aTrue = Boolean.parseBoolean("True");
        System.out.println(aTrue);

        System.out.println(Character.isDigit('w'));
        System.out.println(Character.isLetterOrDigit('$'));
        System.out.println(Character.isLowerCase('f'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('B'));

    }
}
