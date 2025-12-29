package com.skillnext1;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string or number: ");
        String str = sc.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        if(str.equals(reversed)) System.out.println("Palindrome!");
        else System.out.println("Not Palindrome!");
    }
}
