/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check.so.nguyen.to;

import java.util.Scanner;

/**
 *
 * @author nam57
 */
public class CheckSoNguyenTo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap n:");
        int n = sc.nextInt();
        if (isPrime(n)) {
            System.out.println(n + "la so nguyen to");
        } else {
            System.out.println(n + "kp la so nguyen to");
        }

    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
