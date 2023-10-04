package tasks;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		String rps []  = {"r","p","s"};
		
		String computerMove = rps[new Random().nextInt(rps.length)];
		
		
		String PlayerMove;
		
		while(true) {
		 System.out.println("please entre your move(r,p, s)");
		 PlayerMove = sc.nextLine();
		 if( PlayerMove.equals("r") ||PlayerMove.equals("p")|| PlayerMove.equals("s")) {
			 break;
		 }
		 System.out.println(PlayerMove + "is not a valid move");
		}
     
		System.out.println("Computer played: " + computerMove);
		
		if(PlayerMove.equals(computerMove)) {
		   System.out.println("the game was a tie!");
		}
		else if(PlayerMove.equals("r")) {
			if(computerMove.equals("p")) {
				System.out.println("You lose!");
			}else if (computerMove.equals("s")) {
				System.out.println("You Win!"); 
				
			}
       }
		
		else if(PlayerMove.equals("p")) {
			if(computerMove.equals("s")) {
				System.out.println("You lose!");
				
			}else if (computerMove.equals("r")) {
				System.out.println("You Win!"); 
			}
       }
		
		else if(PlayerMove.equals("s")) {
			if(computerMove.equals("r")) {
				System.out.println("You lose!");
				
			}else if (computerMove.equals("p")) {
				System.out.println("You Win!"); 
			}
        }
		System.out.println("Play again ? (y/n)");
		String PlayAgain = sc.nextLine();
		
		if(!PlayAgain.equals("y")) {
			break;
		}
		
		
	}
}
}