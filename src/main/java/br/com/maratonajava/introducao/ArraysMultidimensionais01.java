package br.com.maratonajava.introducao;

public class ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];

        dias[0][0] = 31;
        dias[0][1] = 23;
        dias[0][2] = 21;

        dias[1][0] = 4;
        dias[1][1] = 8;
        dias[1][2] = 29;

        dias[2][0] = 12;
        dias[2][1] = 17;
        dias[2][2] = 18;


        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("------------------");

        for (int[] arrBase : dias) {
            for (int arrays : arrBase) {
                System.out.println(arrays);
            }
        }
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int[][] arrayMulti = new int[3][];

        arrayMulti[0] = new int[]{0, 0};
        arrayMulti[1] = new int[]{1, 2, 3};
        arrayMulti[2] = array;

        for (int[] arrBase : arrayMulti) {
            System.out.println("\n------");
            for (int list : arrBase) {
                System.out.print(list + " ");
            }
        }
        System.out.println();
        int[][] arryMultiInicializacao = {{1, 2, 3}, {4, 5, 6, 7, 8, 9}, {10, 11, 12, 13, 15, 16, 17}};

        for (int[] arrBase : arryMultiInicializacao) {
            System.out.println("\n---------");
            for (int list : arrBase) {
                System.out.print(list+" ");
            }
        }
    }
}
