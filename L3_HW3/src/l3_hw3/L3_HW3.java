/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l3_hw3;

import java.util.Scanner;

/**
 *
 * @author nam57
 */
public class L3_HW3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap do dai chuoi:");
        int length = sc.nextInt();
        int[] array = new int[length];
        int i = 0;
        for (i = 0; i < length; i++) {
            System.out.println("Nhap vao gia tri " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
        int ketqua = check(array);
        System.out.println(ketqua);

        // TODO code application logic here
    }

    public static int check(int[] array) {
        int ketqua = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= array[i + 1]) {
                return ketqua = 1;
            } else if (array[i] >= array[i + 1]) {
                return ketqua = -1;

            } else {
                return ketqua = 0;
            }

        }
        return ketqua;

    }

}
