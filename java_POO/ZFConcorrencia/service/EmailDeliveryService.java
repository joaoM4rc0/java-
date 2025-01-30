package java_POO.ZFConcorrencia.service;

import java_POO.ZEThreads.dominio.Members;

public class EmailDeliveryService implements Runnable{
    private Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " vai comecar a entregar emails ");
        while (members.isOpen() || members.pendingEmails() > 0) {
            try {
                String email = members.retrieveEmail();
                if (email == null) continue;
                System.out.println(threadName + " enviando email para " + email);
                Thread.sleep(2000);
                System.out.println("email eviado com sucesso");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
