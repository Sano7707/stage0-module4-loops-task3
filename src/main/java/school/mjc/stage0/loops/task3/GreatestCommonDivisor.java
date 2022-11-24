package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int min = first > second ? second:first;
        if(min == 0)
            System.out.println(Math.max(first,second));
        else {
            int GCD = 1;
            for (int i = 2; i <= min; i++) {
                if (first % i == 0 && second % i == 0)
                    GCD = i;
            }
            System.out.println(GCD);
        }
    }
}
