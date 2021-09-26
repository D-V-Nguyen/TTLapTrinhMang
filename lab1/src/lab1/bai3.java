/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author Nguyen
 */
public class bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta;
        do {
            System.out.println("Nhap he so a: ");
            a = sc.nextDouble();
            if (a == 0) {
                System.out.println("Nhap lai a.");
            }
        } while (a == 0);
        System.out.println("Nhap he so b: ");
        b = sc.nextDouble();
        System.out.println("Nhap he so c: ");
        c = sc.nextDouble();
        delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem.");
        } else if (delta == 0) {
            double x = (double) -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep X= " + x);
        } else {
            double x1 = (double) (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (double) (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("PT co 2 nghiem phan biet:");
            //System.out.println("x1= "+x1);
            // System.out.println("x2= "+x2);
            System.out.printf("\tx1=%.2f \n", x1); 
            System.out.printf("\tx2=%.3f \n", x2);
           
        }
    }

}
