/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import java.util.Scanner;

/**
 *
 * @author nam57
 */
public class Hw2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Nhap vao phan tu thu " + (i + 1) + ":");
            arr[i] = sc.nextInt();
    }
        System.out.println("1. Nhung gia tri o vi tri chan:");
        System.out.println("2. Nhung gia tri o vi tri le:");
        System.out.println("3. Nhung gia tri chia het cho 2:");
        System.out.println("4. Nhung gia tri chia 5 du 1:");
        System.out.println("5. Nhung gia tri chan:");
        System.out.println("Nhap vao hoat dong muon thuc hien:");
        int a = sc.nextInt();
        switch(a){
            case 1:
                for (int i=0;i<10;i++){
                    if(i%2!=0){
                        System.out.println(arr[i]);
                    }
                }
                break;
            case 2:
                for (int i=0;i<10;i++){
                    if(i%2==0){
                        System.out.println(arr[i]);
                    }
                }
                break;
            case 3:
                for (int i=0;i<10;i++){
                    if(arr[i]%2==0){
                        System.out.println(arr[i]);
                    }else{
                        System.out.println("Khong co");
                    }
                }
                break;
            case 4:
                for (int i=0;i<10;i++){
                    if(i%5==1){
                        System.out.println(arr[i]);
                    }
                    else{
                        System.out.println("Khong co");
                    }
                }
                break;
            case 5:
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    System.out.println(arr[i]);
                        sum += arr[i]; 
        }
                    System.out.println("Tong:" + sum);
        }
        
}
}
