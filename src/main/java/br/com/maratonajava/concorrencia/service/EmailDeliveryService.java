package br.com.maratonajava.concorrencia.service;


import br.com.maratonajava.concorrencia.dominio.Members;

public class EmailDeliveryService implements Runnable {
    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }


    @Override
    public void run() {
        String thread = members.threadName();
        System.out.println(thread + " Starting delivery emails..");

        while (members.isOpen() || members.pendingEmail() > 0) {
            try {
                String email = members.retrieveEmail();
                if (email == null) continue;
                System.out.println("Enviando email para: " + email);
                Thread.sleep(2000);
                System.out.println("Email enviado com sucesso! " + email);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Todos os emails foi enviado com sucesso!");
    }
}
