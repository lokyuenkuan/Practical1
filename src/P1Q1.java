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

public class P1Q1 {
    public static void main(String[] args){
        String name;
        int year;
        double gpa;
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter name: ");
        name = scan.nextLine();
        
        System.out.println("Enter your year of study: ");
        year = scan.nextInt();
        
        System.out.println("what is your target GPA for this semester?: ");
        gpa = scan.nextDouble();
        
        System.out.println("Welcome " + name + "!");
        System.out.println("Work hard to achieve your target GPA of " + gpa + "this semester of your year " + year);
        
    }
}
