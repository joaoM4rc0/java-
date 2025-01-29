package java_POO.ZEThreads.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class ThreadSafeNames {
    private final List<String> names = new ArrayList<>();

    public synchronized void add(String name) {
        this.names.add(name); // Adiciona um nome à lista de maneira segura
    }

    public synchronized void removeName() {
        if (this.names.size() > 0) {
            System.out.println(Thread.currentThread().getName() + " está removendo um item");
            System.out.println(this.names.remove(0)); // Remove o primeiro nome da lista de maneira segura
        }
    }
}

public class ThreadSafeTest01 {
    public static void main(String[] args) {
        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("joao"); // Adiciona um nome à lista
        Runnable r = threadSafeNames::removeName;
        new Thread(r).start(); // Inicia a primeira thread
        new Thread(r).start(); // Inicia a segunda thread
    }
}
