package br.com.maratonajava.poo.enums.test;

import br.com.maratonajava.poo.enums.dominio.Cliente;
import br.com.maratonajava.poo.enums.dominio.TipoCliente;

public class ClienteTest1 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Alison", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Diego", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("José", TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Orochi", TipoCliente.PESSOA_JURIDICA);


        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
