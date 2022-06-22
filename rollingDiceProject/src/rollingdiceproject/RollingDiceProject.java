package rollingdiceproject;

import java.util.Scanner;

public class RollingDiceProject {

    public static void main(String[] args) {
        //variables
        Scanner computerKeyboardInput = new Scanner(System.in);
        int numberSides, numberDice, possibleSums, numberRolls, diceSum, countRolls = 0;
        int[][] rollResult;
        //input
        System.out.println("Dice Rolls by Kevin Bell\n");
        System.out.print("How many sides on a die? ");
        numberSides = computerKeyboardInput.nextInt();
        System.out.print("How many dice shall I roll? ");
        numberDice = computerKeyboardInput.nextInt();
        System.out.print("How many times shall I roll the dice? ");
        numberRolls = computerKeyboardInput.nextInt();
        //set up array
        possibleSums = (numberSides * numberDice) - numberDice + 1;
        rollResult = new int[possibleSums][2];
        for (int i = 0; i < possibleSums; i++) {
            rollResult[i][0] = numberDice + i; //create every possible sum
            rollResult[i][1] = 0; //set each counter to 0
        }
        //roll dice and record results
        for (int i = 0; i < numberRolls; i++) //repeat for number of rolls
        {
            diceSum = 0; //reset dice sum before rolling dice again
            for (int r = 0; r < numberDice; r++) //simulate separate dice rolls
            {
                diceSum += (int) (Math.random() * numberSides + 1);
            } //end for
            for (int f = 0; f < possibleSums; f++) //find sum in array and add 1
            {
                if (rollResult[f][0] == diceSum) {
                    rollResult[f][1]++;
                }
            } //end for
        } //end for
        //output
        System.out.println("Number of times each total occurred:");
        for (int i = 0; i < possibleSums; i++) {
            System.out.printf("result %-6d times rolled %-6d\n",
                    rollResult[i][0], rollResult[i][1]);
            countRolls += rollResult[i][1];
        }
        System.out.printf("Total = %d\n", countRolls);
    } //end main
} //end class RollingDiceSimulation
