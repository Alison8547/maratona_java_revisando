package br.com.maratonajava.introducao;

import java.util.Scanner;

public class Aula25EstruturasCondicionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de acordo com o dia [1]Domingo [2]Segunda [3]Terça [4]Quarta [5]Quinta [6]Sexta [7]Sábado");
        byte dia = scanner.nextByte();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida!");

        }
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Digite [M] para Masculino ou [F] para feminino");
        String sexo = scanner1.nextLine().toUpperCase();

        switch (sexo) {
            case "M":
                System.out.println("Seu sexo é masculino");
                break;
            case "F":
                System.out.println("Seu sexo é feminio");
                break;
            default:
                System.out.println("Opção inválida!");
        }


    }

}
