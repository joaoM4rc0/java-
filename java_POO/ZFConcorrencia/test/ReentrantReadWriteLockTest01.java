package java_POO.ZFConcorrencia.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MapReadLock {
    private final Map<String, String> map = new LinkedHashMap<>();
    private final ReentrantReadWriteLock rwl;

    public MapReadLock(ReentrantReadWriteLock rwl) {
        this.rwl = rwl;
    }
    public void put(String key, String value) {
        rwl.writeLock().lock();
        try {
            if(rwl.isWriteLocked()) {
                System.out.printf("%s esta escrevendo %n", Thread.currentThread().getName());
            }
            map.put(key, value);
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            rwl.writeLock().unlock();
        }
    }
    public Set<String> allKeys() {
        rwl.readLock().lock();
        try {
            return map.keySet();
        }finally {
            rwl.readLock().unlock();
        }
    }
}
public class ReentrantReadWriteLockTest01 {
    public static void main(String[] args) throws InterruptedException {
        ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
        MapReadLock mapReadLock = new MapReadLock(rwl);

        Runnable writer = () -> {
            for (int i = 0; i < 20; i++) {
                mapReadLock.put(String.valueOf(i), String.valueOf(i));
            }
        };
        Runnable reader = () -> {
            if (rwl.isWriteLocked()) {
                System.out.println("WRITE BLOCKED!");
            }
                System.out.println(Thread.currentThread().getName() + "  " + mapReadLock.allKeys());
        };

        Thread t1 = new Thread(writer );
        Thread t2 = new Thread(reader);
        Thread t3 = new Thread(reader );
        t1.start();
        t1.join();
        t2.start();
        t3.start();
    }

}
