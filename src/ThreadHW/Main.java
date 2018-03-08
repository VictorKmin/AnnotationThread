package ThreadHW;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] ints = new int[99999999];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) Math.floor(Math.random()*999)+0;
//            System.out.println(ints[i]);
        }
        Thread middleThread = new Thread(() -> {
            double avarage = 0;
            int sum = 0;
            for (int i = 0; i < ints.length; i++) {
                sum += ints[i];
            }
            avarage = sum / ints.length;
            System.out.println(avarage);
        });
        Thread biggesrThread = new Thread(() -> {
            int max = ints[0];
            for (int i = 1; i < ints.length; i++) max = Math.max(max, ints[i]);
            System.out.println(max);
        });

        Thread sortedThread = new Thread(() -> {
            Arrays.sort(ints);
            System.out.println(ints);
        });
//        System.out.println(ints);
        
        middleThread.start();
        biggesrThread.start();
        sortedThread.start();
    }
}
