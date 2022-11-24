package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if(lengthOfLastNumber < 0)
            System.out.println("0");
        else {
            int sum = 0;
            int times = 1;
            for (int i = 0; i < lengthOfLastNumber; i++) {
                sum += times * 9;
                times += Math.pow(10, i + 1);
            }
            System.out.println(sum);
        }
    }
}
