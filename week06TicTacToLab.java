package week06;

import java.util.Scanner;

public class week06TicTacToLab {

	public static void main(String[] args) {
		GameBoard gameBoard = new GameBoard();
		gameBoard.initialize();
		gameBoard.display();
		
		String winner = "";
		String player = "O";
		int sqr = 1;
		int number;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("              ****************");
		System.out.println("     Welcome to game of Tic Tac To fellows!");
		System.out.println("          First turn: " + player);
		System.out.println("              ****************");
		
		
		while(winner.equals("") && sqr <=9) {
			System.out.println(player + "'s turn");
			System.out.println("Select a number to place an " + player);
			String input = sc.nextLine();
			number = Integer.valueOf(input); 
			
			if (number > 0 && number <= 9 ) {
				if(gameBoard.ifValidSquare(number, input, player)) {
					if(player.equals("O")) {
						player = "X";
						
					} else {
						player = "O";
					}
					sqr++;
					gameBoard.display();
					winner = gameBoard.checkWinStatus();
				} else {
					System.out.println("Square is already filled out");
				}								
			}
		}
		
		System.out.println("********************");
		System.out.println("     Game Over!");
		if (winner.equals("draw")) {
			System.out.println("That's unfortunate!");
			System.out.println("This game is a " + winner + "!");
		} else {
			System.out.println("Yay!" + winner + "wins!");
		}
		System.out.println("********************");
		
		
		
		
		
		sc.close();
	}

}
