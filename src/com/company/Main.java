package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(GetNumber.getTwoNumbers());

    }
    public static int getUserInputs(){
        Scanner input = new Scanner(System.in);
        try{
            int userInput = input.nextInt();
            return userInput;
        }
        catch(Exception e){
            System.out.println("Value is not an integer");
        }
        return 0;
    }

}
