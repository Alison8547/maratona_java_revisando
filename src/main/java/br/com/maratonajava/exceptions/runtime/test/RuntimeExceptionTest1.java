package br.com.maratonajava.exceptions.runtime.test;

public class RuntimeExceptionTest1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(nums[3]);

        Object object = null;

        System.out.println(object.toString());

    }
}
