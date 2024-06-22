package javaPractice;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {

    int x;
    Scanner sc = new Scanner(System.in);
    x= sc.nextInt();
    for(int i = 0;i<x;i++){
        for(int j = 0;j<=i;j++ ) {
            System.out.print("*");
        }
        System.out.println();
}}}
