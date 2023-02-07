package br.com.maratonajava.concorrencia.test;



import br.com.maratonajava.concorrencia.dominio.Members;
import br.com.maratonajava.concorrencia.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest1 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread alison = new Thread(new EmailDeliveryService(members), "Alison");
        Thread maria = new Thread(new EmailDeliveryService(members), "Maria");
        alison.start();
        maria.start();
        while (true) {
            String email = JOptionPane.showInputDialog("Entre com seu email:");
            if (email == null || email.isEmpty()) {
                members.close();
                break;
            }

            members.addMemberEmail(email);
        }


    }
}
