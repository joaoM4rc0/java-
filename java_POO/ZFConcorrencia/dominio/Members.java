package java_POO.ZFConcorrencia.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
// sinceramente utilizando o lock que em tese era para facilitar. eu nao sei se foi isso que ocorreu
// ele aplicou mais uma camada de cosido, nesse caso o syncronized resolveria sem problemas
public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    public boolean isOpen() {
        return open;
    }
    public int pendingEmails() {
        lock.lock();
        try {
            return emails.size();

        }finally {
            lock.unlock();
        }
    }

    public void addEmails(String email) {
        lock.lock();
        try {
            String threadName = new Thread().getName();
            System.out.println(threadName + " adicionou elemento na lista ");
            this.emails.add(email);
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checando se tem email");
        lock.lock();
        try {
            while(this.emails.isEmpty()) {
                if (!open) return null;
                System.out.println(Thread.currentThread().getName() + " Não tem emails disponiveis na lista, entrando em modo de espera");
                condition.await();
            }
            return this.emails.poll();
        }finally {
            lock.unlock();
        }
    }
    public void close() {
        open = false;
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " nao vamos pegar mais emails ");
            this.emails.notifyAll();
        }finally {
            lock.unlock();
        }
    }
}
