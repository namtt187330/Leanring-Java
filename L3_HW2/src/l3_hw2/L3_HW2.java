/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l3_hw2;

import java.util.Scanner;

/**
 *
 * @author nam57
 */
public class L3_HW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap so dau tien:");
        int s1 = sc.nextInt();
        System.out.println("moi ban nhap so thu hai:");
        int s2 = sc.nextInt();
        boolean bool = tich(s1, s2);
        System.out.println("ket qua la: " + bool);
        // TODO code application logic here
    }

    public static boolean tich(int s1, int s2) {
        System.out.println("Thuc hien phep nhan");
        int tich = s1 * s2;
        if (tich % 3 == 0 && tich % 5 == 0) {
            return true;
        } else {
            return false;

        }

    }
}
