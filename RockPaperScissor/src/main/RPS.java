package main;
import java.util.*;

public class RPS {
	
	public static void main(String [] args) {
		
	System.out.println("Welcome to Dagm's Rock, Paper, Scissor game.                                                                      Start Date: (4/5/21) - End date: (4/5/21)  Updates(0)");
	
	Scanner scanner = new Scanner(System.in);
	int mainLoop = 1;
	int repeat = 1;
	int answerSaverU = 0;
	int answerSaverAI = 0;
	String progChoiceU = " ";
	String progChoiceAI = " ";
	
	System.out.println();
	
	while(mainLoop != 0) {
	while(repeat != 0) {
		
		System.out.print("Choose between the following: Rock, Paper, Scissor: ");
		String input = scanner.nextLine();
		
		String progInput = input.toLowerCase();
		
		if(progInput.startsWith("ro")) {
			repeat = 0;
			answerSaverU = 1;
			progChoiceU = "Rock";
		}
		else if(progInput.startsWith("pa")) {
			repeat = 0;
			answerSaverU = 2;
			progChoiceU = "Paper";
		}
		else if(progInput.startsWith("sc")) {
			repeat = 0;
			answerSaverU = 3;
			progChoiceU = "Scissor";
		}
		else {
			System.out.println("Invalid input. Please enter again");
		}
	}	
		repeat = 1;
		
		int randLoop = 1;              //this will keep the loop running if the randomizer chooses the number 4
		
		while(randLoop != 0) {                     //WORK ON THE RANDOMIZER AND THE LOOP. ITS NOT BUILT CORRECTLY
			int rand = (int) ((Math.random() *3) + 1);

			
			if(rand == 1) {
				progChoiceAI = "Rock";
				answerSaverAI = 1;
				randLoop = 0;
			}
			else if(rand == 2) {
				progChoiceAI = "Paper";
				answerSaverAI = 2;
				randLoop = 0;
			}
			else if(rand == 3) {
				progChoiceAI = "Scissor";
				answerSaverAI = 3;
				randLoop = 0; 
			}
			else {
			
			}
			
		}
		randLoop = 1;               //this will let the while loop run if the user decided to run the program again by answer the question below
		
		int repeata = 1;
		
		if(answerSaverU == answerSaverAI) {
			
			System.out.print("You chose " + progChoiceU + " and your opponent chose " + progChoiceAI + ". It's a tie. Would you like to try again? ");
			
			while(repeata != 0) {
				String again = scanner.nextLine();
				String progagain = again.toLowerCase();
			
				if(progagain.startsWith("y")) {
					repeata = 0;
					System.out.println();
				}
				else if(progagain.startsWith("n")) {
					repeata = 0;
					repeat = 0;                       //this stops the main loop
					mainLoop =0;
					System.out.println();
				}
				else {
					int invalid = 0;
					
					while (invalid != 1) {
					System.out.print("Invalid entry. Please answer the question with a yes or a no. \n\nWould you like to try again? ");
					again = scanner.nextLine();
					progagain = again.toLowerCase();
					
					if(progagain.startsWith("y")) {
						repeata = 0;
						invalid = 1;
						System.out.println();
					}
					else if(progagain.startsWith("n")) {
						repeata = 0;
						repeat = 0;                       //this stops the main loop
						mainLoop =0;
						invalid = 1;
						System.out.println();
					}
					else {
						
					}
					}
				}
			}
		}
		
		else if((answerSaverU == 1 && answerSaverAI == 2) || (answerSaverU == 2 && answerSaverAI == 3) || (answerSaverU == 3 && answerSaverAI == 1)) {

			System.out.print("You chose " + progChoiceU + " and your oponent chose " + progChoiceAI + ". You lost. Would you like to try again? ");
			
			while(repeata != 0) {
				String again = scanner.nextLine();
				String progagain = again.toLowerCase();
			
				if(progagain.startsWith("y")) {
					repeata = 0;
				}
				else if(progagain.startsWith("n")) {
					repeata = 0;
					repeat = 0;                       //this stops the main loop
					mainLoop =0;
				}
				else {
					int invalid = 0;
					
					while (invalid != 1) {
					System.out.print("Invalid entry. Please answer the question with a yes or a no. \n\nWould you like to try again? ");
					again = scanner.nextLine();
					progagain = again.toLowerCase();
					
					if(progagain.startsWith("y")) {
						repeata = 0;
						invalid = 1;
						System.out.println();
					}
					else if(progagain.startsWith("n")) {
						repeata = 0;
						repeat = 0;                       //this stops the main loop
						mainLoop =0;
						invalid = 1;
						System.out.println();
					}
					else {
						
					}
					}
				}
			}
		}
		else {
			System.out.print("You chose " + progChoiceU + " and your oponent chose " + progChoiceAI + ". You won. Would you like to try again? ");
			
			while(repeata != 0) {
				String again = scanner.nextLine();
				String progagain = again.toLowerCase();
			
				if(progagain.startsWith("y")) {
					repeata = 0;
					System.out.println();
				}
				else if(progagain.startsWith("n")) {
					repeata = 0;
					repeat = 0;                       //this stops the main loop
					mainLoop =0;
				}
				else {
					int invalid = 0;
					
					while (invalid != 1) {
					System.out.print("Invalid entry. Please answer the question with a yes or a no. \n\nWould you like to try again? ");
					again = scanner.nextLine();
					progagain = again.toLowerCase();
					
					if(progagain.startsWith("y")) {
						repeata = 0;
						invalid = 1;
						System.out.println();
					}
					else if(progagain.startsWith("n")) {
						repeata = 0;
						repeat = 0;                       //this stops the main loop
						mainLoop =0;
						invalid = 1;
						System.out.println();
					}
					else {
						
					}
					}
				}
			}
			
		}
	//	else if(//put parameters here){
			
	//	}
		repeata = 1;
	}
	
	scanner.close();
	System.out.println();
	System.out.println();
	System.out.print("End of Program");
	}
}