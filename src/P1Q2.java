/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuenkuan
 */
import java.util.Scanner;

public class P1Q2 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int age, days, seconds;

        System.out.print("Enter your age(Years): ");
        age = scan.nextInt();

        days = age * 365;
        seconds = days * 24 * 60 * 60;

        System.out.println("Age in years : " + age);
        System.out.println("Age in days : " + days);
        System.out.println("Age in seconds : " + seconds);
    }
}
