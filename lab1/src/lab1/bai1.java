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
public class bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 0;
        float f;
        double d;
        long l;
        char ch;
        String str;
        boolean check = false;
        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap mot so nguyen:");
//        a = sc.nextInt();
        do {
            try {
                System.out.println("Nhap vao n:");
                a = Integer.parseInt(sc.nextLine());
                check = true;
            } catch (java.lang.NumberFormatException e) {
                System.out.println("hay nhap dung kieu du lieu" + e.toString());
                check = false;
            }
        } while (check == false);
        System.out.println("Nhap mot so thuc:");
        f = sc.nextFloat();
        System.out.println("Nhap mot so double:");
        d = sc.nextDouble();
        System.out.println("Nhap mot so long:");
        l = sc.nextLong();
        System.out.println("Nhap mot ki tu:");
        sc.nextLine(); // ki tu ket thuc nhap se bi mat
        ch = sc.nextLine().charAt(0);
        System.out.println("Nhap mot chuoi:");
        str = sc.nextLine();
        System.out.println("Du lieu vua nhap:");
        System.out.println("a=" + a);
        System.out.println("l=" + l);
        System.out.println("f=" + f);
        System.out.println("ch=" + ch);
        System.out.println("str=" + str);
        System.out.println("d=" + d);
        System.out.println("\nIn tren cung 1 dong:");
        System.out.println("a=" + a + ", f=" + f + ", l=" + l + ", d=" + d + ", ch=" + ch + ",str=" + str);

    }

}
