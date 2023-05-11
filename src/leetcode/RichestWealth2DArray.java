package leetcode;

public class RichestWealth2DArray {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }

    /**
     * @param accounts 2D array
     * @return Return the wealth that the richest customer has.
     */
    static int maximumWealth(int[][] accounts) {

        int maxWealth = 0;

        for (int outer = 0; outer < accounts.length; outer++){

            int temp = 0;
            System.out.println("The outer index is: " + outer);

            for (int inner = 0; inner < accounts[outer].length ; inner++) {
                temp+=accounts[outer][inner];
                System.out.println("The current temp value is: " + temp);
            }

            maxWealth = Math.max(maxWealth, temp);
            System.out.println("The current maxWealth is: " + maxWealth);
        }
        return maxWealth;
    }
}
