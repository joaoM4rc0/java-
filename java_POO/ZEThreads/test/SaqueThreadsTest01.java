package java_POO.ZEThreads.test;

import java_POO.ZEThreads.dominio.Banco;

public class SaqueThreadsTest01 implements Runnable {
    private final Banco banco = new Banco();
    public static void main(String[] args) {
        SaqueThreadsTest01 saqueThreadsTest01 = new SaqueThreadsTest01();
        Thread t1 = new Thread(saqueThreadsTest01, "joao");
        Thread t2 = new Thread(saqueThreadsTest01, "maria");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            sacar(10);
            if(banco.getSaldo() < 0) {
                System.out.println("fudeu para um caralho");
            }
        }

    }

    private synchronized void sacar(int dinheiro) {
        if (banco.getSaldo() >= dinheiro) {
            System.out.println(getName() + " está indo sacar o dinheiro");
            banco.Sacar(dinheiro);
            System.out.println(" completou o saque, valor da conta: " + banco.getSaldo());

        }else {
            System.out.println(getName() + " nao conseguiu sacar ");
        }
    }
//    private void sacar2(int dinheiro) {
//        synchronized (banco) {
//
//        if (banco.getSaldo() >= dinheiro) {
//            System.out.println(getName() + " está indo sacar o dinheiro");
//            banco.Sacar(dinheiro);
//            System.out.println(" completou o saque, valor da conta: " + banco.getSaldo());
//
//        }else {
//            System.out.println(getName() + " nao conseguiu sacar ");
//        }
//        }
//    }

    private static String getName() {
        return Thread.currentThread().getName();
    }
}
