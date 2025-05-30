package numerosaleatorios;

import numerosaleatorios.integracao.GameLayer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameLayer gameLayer = new GameLayer();
        Scanner input = new Scanner(System.in);

        while (gameLayer.hasAttempt()) {
            System.out.println("Enter your guess:");
            int playerNumber = input.nextInt();
            gameLayer.setGuessedNumber(playerNumber);

            if (gameLayer.isCorrect()) {
                System.out.println("Congratulations! You guessed the correct number!");
                break;
            } else {
                gameLayer.registerAttempt();
                System.out.println("Wrong guess! You have " + gameLayer.remainingAttempts() + " attempts left.");
                if (!gameLayer.isHot()) {
                    System.out.println("The target number is higher!");

                } else {
                    System.out.println("The target number is lower!");
                }
            }
        }

        if (!gameLayer.isCorrect()) {
            System.out.println("Game over! You've run out of attempts. the number was " + gameLayer.getKeyNumber() );
        }

        }
    }
