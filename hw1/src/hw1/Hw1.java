/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;

import java.util.Scanner;

/**
 *
 * @author nam57
 */
public class Hw1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap vao phan tu thu " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println("1. Chuyen moi phan tu le thanh -1");
        System.out.println("2. Tim gia tri lon nhat cua mang");
        System.out.println("3. Gia tri nho nhat thanh -1");
        System.out.println("4. Nhap x va in ra cac so nho hon x");
        System.out.println("5. in ra gia tri gan x nhat");
        System.out.println("Nhap vao hoat dong muon thuc hien:");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                for (int i = 0; i < n; i++) {
                    if (arr[i] % 2 != 0) {
                        arr[i] = -1;
                        System.out.print(arr[i]);
                    }
                }
                break;
            case 2:
                for (int i = 0; i < n; i++) {
                    int max = arr[0];
                    for (i = 0; i < n - 1; i++) {
                        if (arr[i + 1] > arr[i]) {
                            max = arr[i + 1];
                        }
                    }
                    System.out.println("Gia tri lon nhat la:" + max);
                }
                break;
            case 3:
                for (int i = 0; i < n; i++) {
                    int min = arr[0];
                    for (i = 0; i < n; i++) {
                        if (arr[i + 1] > arr[i]) {
                            min = arr[i + 1];
                            System.out.println("Gia tri nho nhat la:" + min);
                        }
                        min = -1;
                        System.out.println("Min =" + min);
                    }
                }
                break;
            case 4:
                System.out.print("Nhap vao 1 so:");
                int x = sc.nextInt();
                int i;
                for(i=0; i<n;i++){
                    if(arr[i] < x ){
                        System.out.println(arr[i]);
                    }
                }
                break;
            case 5:
                System.out.print("Nhap vao 1 so:");
                int f = sc.nextInt();
                for (i=0; i<n;i++){
                    
                }

            // TODO code application logic here
        }
    }
}
