package java_POO.ZDStream.test;


import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ParallelStreamsTest01 {
    public static void main(String[] args) {
        long num = 10_000_000;
//        SumFor(num);
//        SumStreamIterate(num);
//        SumStreamParallelIterate(num);
        SumParalleLongStreamlIterate(num);
    }
    private static void SumFor(long num) {
        long result = 0;
        long init = System.currentTimeMillis();
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms ");
    }
    private static void SumStreamIterate(long num) {
        long result = 0;
        long init = System.currentTimeMillis();
        Long reduce = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(reduce + " " + (end - init) + "ms ");
    }
    private static void SumStreamParallelIterate(long num) {
        long result = 0;
        long init = System.currentTimeMillis();
        Long reduce = Stream.iterate(1L, i -> i + 1).parallel().limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(reduce + " " + (end - init) + "ms ");
    }
    private static void SumParalleLongStreamlIterate(long num) {
        long init = System.currentTimeMillis();
        long reduce = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(reduce + " " + (end - init) + "ms ");
    }

}

