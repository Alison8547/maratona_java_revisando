package br.com.maratonajava.poo.enums.test;

import br.com.maratonajava.poo.enums.dominio.Cliente;
import br.com.maratonajava.poo.enums.dominio.TipoCliente;
import br.com.maratonajava.poo.enums.dominio.TipoPagamento;

public class ClienteTest1 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Alison", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Diego", TipoCliente.PESSOA_JURIDICA);


        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));


        System.out.println(TipoCliente.tipoClientePorRelatorio("Pessoa Fisíca"));
        System.out.println(TipoCliente.tipoClientePorRelatorio("Pessoa Juridica"));

    }
}
