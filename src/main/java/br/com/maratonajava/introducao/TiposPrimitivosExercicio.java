package br.com.maratonajava.introducao;

import java.time.LocalDate;

public class TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Alison";
        String endereco = "Rua da liberdade";
        double salario = 1500.0d;
        LocalDate data = LocalDate.now();
        String relatorio = String.format("Eu %s, morando no endereço %s confirmo que recebi o salário de R$ %.2f, na data %s%n", nome, endereco, salario, data);
        System.out.println(relatorio);
    }
}
