/* * ********************************************** * San Francisco State University * CSC 220 -  Data Structures * File Name: Assignment02PartE02.java * Author: Duc Ta * Author: Kullathon Sitthisarnwattanachai * ********************************************** */package assignment03PartE;public class Assignment03PartE02 {    public static void main(String[] args) {    }    private static String colorFaster(long d) {        return "\033[0;32m" + d + "\033[0m";    }    private static String colorSlower(long d) {        return "\033[0;31m" + d + "\033[0m";    }    /**     * Run the test.     *     * @return The number at which Loop A was faster than Loop B.     */    private static int runTest() {        int beatenAt = 0;        int runUntil = Integer.MAX_VALUE;        String format = "[n = %-8d] %-15s ns vs %-15s ns%n";        for (int n = 1; n < runUntil; n++) {            long start, stop, deltaA, deltaB;            // Time loop A            start = System.nanoTime();            loopA(n);            stop = System.nanoTime();            deltaA = stop - start;            // Time loop B            start = System.nanoTime();            loopB(n);            stop = System.nanoTime();            deltaB = stop - start;            if (deltaA < deltaB) {                beatenAt = n;                runUntil = n + 10;                System.out.println("=".repeat(50));                System.out.printf(format, n, colorFaster(deltaA), colorSlower(deltaB));                System.out.println("=".repeat(50));            } else {                System.out.printf(format, n, colorSlower(deltaA), colorFaster(deltaB));            }        }        return beatenAt;    }    private static void loopA(int n) {        int i, j, sum = 0;        for (i = 1; i <= n; i++) {            for (j = 1; j <= 10000; j++) {                sum = sum + j;            }        }    }    private static void loopB(int n) {        int i, j, sum = 0;        for (i = 1; i <= n; i++) {            for (j = 1; j <= n; j++) {                sum = sum + j;            }        }    }}