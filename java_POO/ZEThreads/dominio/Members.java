package java_POO.ZEThreads.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }
    public int pendingEmails() {
        synchronized (emails) {
            return emails.size();
        }
    }

    public void addEmails(String email) {
        synchronized (this.emails) {
            String threadName = new Thread().getName();
            System.out.println(threadName + " adicionou elemento na lista ");
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checando se tem email");

        synchronized (this.emails) {
            while(this.emails.isEmpty()) {
                if (!open) return null;
                System.out.println(Thread.currentThread().getName() + " Não tem emails disponiveis na lista, entrando em modo de espera");
                this.emails.wait();
            }
            return this.emails.poll();
        }
    }
    public void close() {
        open = false;
        synchronized (this.emails) {
            System.out.println(Thread.currentThread().getName() + " nao vamos pegar mais emails ");
            this.emails.notifyAll();
        }
    }
}
