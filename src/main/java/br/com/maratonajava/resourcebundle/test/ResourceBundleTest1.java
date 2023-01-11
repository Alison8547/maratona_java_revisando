package br.com.maratonajava.resourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest1 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", Locale.getDefault());
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("hi"));
        System.out.println(bundle.getString("good.morning"));
    }
}
