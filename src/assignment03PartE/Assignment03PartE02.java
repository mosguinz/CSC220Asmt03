/* * ********************************************** * San Francisco State University * CSC 220 -  Data Structures * File Name: Assignment02PartE02.java * Author: Duc Ta * Author: Kullathon Sitthisarnwattanachai * ********************************************** */package assignment03PartE;public class Assignment03PartE02 {    public static void main(String[] args) {    }    private static void loopA() {        int i, n, j, sum;        for (i = 1; i <= n; i++) {            for (j = 1; j <= 10000; j++) {                sum = sum + j;            }        }    }    private static void loopB() {        int i, n, j, sum;        for (i = 1; i <= n; i++) {            for (j = 1; j <= n; j++) {                sum = sum + j;            }        }    }}