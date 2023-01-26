package JavaDSA.DynamicProgramming;

import java.util.Arrays;

public class minimumCoins {
    public static int minCoins(int n, int[] coins, int[] numCoins) {
        if (n == 0)
            return 0;

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {

            if (n - coins[i] >= 0) {
                int subAns = 0;
                if (numCoins[n - coins[i]] != -1) {
                    subAns = numCoins[n - coins[i]];
                } else {
                    subAns = minCoins(n - coins[i], coins, numCoins);
                    numCoins[n - coins[i]] = subAns;
                }
                if (subAns != Integer.MAX_VALUE && subAns + 1 < ans)
                    ans = subAns + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 18;
        int[] coins = { 7, 5, 1 };
        int[] numCoins = new int[18];
        Arrays.fill(numCoins, -1);
        System.out.println(minCoins(n, coins, numCoins));
    }
}
