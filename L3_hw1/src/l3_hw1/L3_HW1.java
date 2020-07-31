/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l3_hw1;

import java.util.Scanner;

/**
 *
 * @author nam57
 */
public class L3_HW1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m, n, q, p;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhap vao so dong cua ma tran dau tien:");
            m = sc.nextInt();
            System.out.println("Nhap vao so cot cua ma tran dau tien:");
            n = sc.nextInt();
            System.out.println("Nhap vao so dong cua ma tran thu hai:");
            q = sc.nextInt();
            System.out.println("Nhap vao so cot cua ma tran thu hai:");
            p = sc.nextInt();
        } while (m < 1 || n < 1 || q < 1 || p < 1);
        int A[][] = new int[m][n];
        int B[][] = new int[q][p];
        if (m != q || n != p) {
            System.out.println("Khong cong duoc");
        } else {
            int[][] C = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println("Input phan tu" + (i + 1) + (j + 1) + "o ma tran A");
                    A[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < q; i++) {
                for (int j = 0; j < p; j++) {
                    System.out.println("Input phan tu" + (i + 1) + (j + 1) + "o ma tran B");
                    A[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    C[i][j] = A[i][j] + B[i][j];

                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println(C[i][j] + "");
                }

                // TODO code application logic here
            }
        }
    }
    }
