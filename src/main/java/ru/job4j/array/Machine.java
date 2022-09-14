package ru.job4j.array;

import java.util.Arrays;

        /*while (change != 0) {
            for (int i = 0; i < coins.length; i++) {
                if (change >= coins[i]) {
                    rsl[size] = coins[i];
                    change = change - coins[i];
                    size = size + 1;
                    break;
                }
            }

        }*/

public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        for (int coin : coins) {
            while (coin <= change) {
                rsl[size] = coin;
                change = change - coin;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
