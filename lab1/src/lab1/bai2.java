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
public class bai2 {

    public static void main(String[] args) {
        int a, b,c, max, min;
        Scanner sc = new Scanner(System.in); //Phím tắt CTRL + Space
        System.out.println("Nhap so nguyen a:");
        a = sc.nextInt();
        System.out.println("Nhap so nguyen b:");
        b = sc.nextInt();
        System.out.println("Nhap so nguyen c:");
        c = sc.nextInt();
//        max = (a > b) ? a : b;
        //(Bieu thu logic) ? gia tri true : gia tri false
//        min = (a > b) ? b : a;
//        if (a>b) {
//            max=a;
//            min=b;
//        }
//        else{
//            max=b;
//            min=a;
//        }
        max=(a>b)?a:(b>c)?b:c;
        min=(a<b)?a:(b<c)?b:c;
        System.out.println("Max la:" + max);
        System.out.println("Min la:" + min);
    }

}
