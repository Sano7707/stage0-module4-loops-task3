package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String s = t + "";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '-')
                continue;
           sum+= Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        System.out.println(sum);
    }
}
