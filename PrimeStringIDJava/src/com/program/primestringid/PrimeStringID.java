package com.program.primestringid;

import java.util.Scanner;
import java.io.InputStreamReader;

public class PrimeStringID {
    public static void main(String[] args){
        System.out.println("Minion ID Generator");
        System.out.println("Enter any number.");

        Integer inputAsNumber = 0, whole;
        String primeString = "";



        for (Integer l = 0; l <= 1993; l++){
            Scanner scanner = new Scanner(new InputStreamReader(System.in));
            String input = scanner.nextLine();
            try {
                inputAsNumber = Integer.parseInt(input);
            } catch (Exception e){
                System.out.println("Input is not a valid number! Please enter a valid number.");
                inputAsNumber = 0;
            }
            if (inputAsNumber > 0 && inputAsNumber <= 1000){
                System.out.println("You entered a valid number: " + inputAsNumber);
                break;
            }
        }


        for (Integer i = 2; i <= 1993; i++){
            whole = 0;
            for (Integer j = 2; j < i; j++){
                if (i % j == 0){
                    whole++;
                }
            }
            if (whole == 0){
                primeString = primeString + i;
            }
        }
        //System.out.println(primeString);

        System.out.print("Your ID Number is: ");
        System.out.print(primeString.substring(inputAsNumber, inputAsNumber + 5));
    }
}
