package ru.job4j.array;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int time = 8;
        int hoursalary = 10;
        int extrasalary = 15;
        int weekhour = 2 * hoursalary;
        int weekextra = 2 * extrasalary;
        int rsl = 0;
        for (int i = 0; i < hours.length - 2; i++) {
            if (hours[i] > time) {
                rsl = rsl + extrasalary * (hours[i] - time) + hoursalary * time;
            } else if (hours[i] <= time) {
                rsl = rsl + hoursalary * hours[i];
            }
        }
        for (int i = 5; i < hours.length; i++) {
            if (hours[i] > time) {
                rsl = rsl + weekextra * (hours[i] - time) + weekhour * time;
            } else if (hours[i] <= time) {
                rsl = rsl + weekhour * hours[i];
            }
        }
        return rsl;
    }
}

