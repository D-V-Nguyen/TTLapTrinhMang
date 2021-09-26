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
public class bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tong, sodien;
        Scanner sc= new Scanner(System.in);
        do{
        System.out.println("Nhap so dien su dung cua thang: ");
        sodien = sc.nextInt();
        }while (sodien<=0);
        if (sodien<50) {
            tong = sodien* 5000;
            System.out.println("Tien dien cua thang: "+ tong);
        }
        else{
            tong = 50*5000+(sodien-50)*6200;
            System.out.println("Tien dien cua thang: "+ tong);
        }
    }
    
}
