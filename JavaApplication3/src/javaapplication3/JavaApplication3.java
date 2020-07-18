/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;
// Bai tap 2:
/**
 *
 * @author nam57
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap n:");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println("Uoc so cua n la" + i);
            }
        }

    }

}
