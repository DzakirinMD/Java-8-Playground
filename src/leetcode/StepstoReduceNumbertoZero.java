package leetcode;

public class StepstoReduceNumbertoZero {
    public static void main(String[] args) {
        int num = 14;
        System.out.println("Output: " + numberOfSteps(num));

    }

    /**
     * Given an integer num, return the number of steps to reduce it to zero.
     * In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
     * @param num input number
     * @return number of steps to reduce it to zero.
     */
    static int numberOfSteps(int num) {
        int step = 1;
        while (num != 0) {
            System.out.print("Step " + step + ")");
            if(num % 2 == 0) {
                System.out.print(" " + num + " is even;");
                num = num / 2;
                System.out.print(" divide by 2 obtain " + num + "\n");
                step ++;
            }
            else {
                System.out.print(" " + num + " is odd;");
                num = num - 1;
                System.out.print(" subtract by 1 obtain " + num + "\n");
                step++;
            }
        }
        return step - 1;
    }
}
