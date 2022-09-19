package br.com.maratonajava.introducao;

import java.util.Scanner;

public class ExercicioSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de acordo com o dia [1]Domingo [2]Segunda [3]Terça [4]Quarta [5]Quinta [6]Sexta [7]Sábado");
        System.out.println("Para saber se é dia útil ou final de semana.");
        byte dia = scanner.nextByte();
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana!");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil!");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
