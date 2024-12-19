package com.example.project;
import java.util.Scanner;
public class Day1 {
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};

    public static String generateElfName(String name) {
        int randomName = (int)(Math.random() * 4 + 1);
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        return elf_names[randomName] + " " + name;  
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your desired name: ");
        String name = scan.nextLine();
        System.out.println("Your elf name is: " + generateElfName(name));

        scan.close();
    }
}