package com.company.asquith;

public class Main {

    public static void main(String[] args) {

        int highTemp[] = {45, 49, 10, 22, 41, 28, 33};
        double precProb[] = {.95, .60, .25, .05, 0, .75, .90};
        String daysOfWeek[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (int i = 0; i <= 6; i++) {
            if (highTemp[i] <= 32 && precProb[i] > .50) {
                System.out.println("It's likely to snow on: " + daysOfWeek[i]);
            }
        }
    }
}
