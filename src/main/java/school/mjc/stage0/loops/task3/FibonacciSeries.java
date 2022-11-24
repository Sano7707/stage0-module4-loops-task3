package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int n0 = 0;
        int n1 = 1;
        for (int i = 0; i < lastFibonacci; i++) {
            System.out.println(n0);
            int temp = n0;
            n0 = n1;
            n1 += temp;
        }
    }
}
