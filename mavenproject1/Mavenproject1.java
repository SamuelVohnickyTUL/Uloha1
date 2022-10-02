/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author Majitel
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Zadejte první číslo");
        String num1 = myObj.nextLine();
        int num2 = Integer.parseInt(num1);
        
        System.out.print("Zadejte druhé číslo");
        String num3 = myObj.nextLine();
        int num4 = Integer.parseInt(num3);
        
        int soucet = num2+num4;
        int soucin = num2*num4;
        
        System.out.print("Jejich součet je:");
        System.out.print(soucet);
        System.out.print("Jejich součin je:");
        System.out.print(soucin);
    }
}
