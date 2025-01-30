package java_POO.ZFConcorrencia.test;



import java_POO.ZFConcorrencia.dominio.Members;
import java_POO.ZFConcorrencia.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();

        Thread joao = new Thread(new EmailDeliveryService(members), "Joao");
        Thread davi = new Thread(new EmailDeliveryService(members), "davi");
        joao.start();
        davi.start();

        while(true) {
            String email = JOptionPane.showInputDialog("entre com seu email");
            if (email == null || email.isEmpty()) {
                members.close();
                break;
            }
            members.addEmails(email);


        }
    }
}
