package week06;

import java.util.Arrays;

public class GameBoard {
	String[] board = new String[9];
	
	public void initialize() {
		for(int i = 1; i<=9; i++) {
			this.board[i-1]= String.valueOf(i);
		}
	}
	public void display() {
		System.out.println("     +---+---+---+");
		System.out.println("     | " +this.board[0] + " | "+this.board[1]+ " | " +this.board[2] + " | ");
		System.out.println("     +---+---+---+");
		System.out.println("     | " +this.board[3] + " | "+this.board[4]+ " | " +this.board[5] + " | ");
		System.out.println("     +---+---+---+");
		System.out.println("     | " +this.board[6] + " | "+this.board[7]+ " | " +this.board[8] + " | ");
		System.out.println("     +---+---+---+");
	}
	public boolean ifValidSquare(int number, String input, String player) {
		if (this.board[number -1].equals(input)) {
			this.board[number -1] = player;
			return true;
		} else {
			return false;
		}
		
	}
	public String checkWinStatus() {
		// It's set to 8 because there are 8 possible ways to win.
		for (int x = 0; x < 8; x++) {
			String concatX = "";
			
			switch (x) {
			//Horizontal possibilities.
			case 0:
				concatX = this.board[0] + this.board[1] + this.board[2];
				break;
			case 1:
				concatX = this.board[3] + this.board[4] + this.board[5];
				break;
			case 2:
				concatX = this.board[6] + this.board[7] + this.board[8];
				break;
			//Vertical possibilities.
			case 3:
				concatX = this.board[0] + this.board[3] + this.board[6];
				break;
			case 4:
				concatX = this.board[1] + this.board[4] + this.board[7];
				break;
			case 5:
				concatX = this.board[2] + this.board[5] + this.board[8];
				break;
			//Diagonal possibilities.
			case 6:
				concatX = this.board[0] + this.board[4] + this.board[8];
				break;
			case 7:
				concatX = this.board[2] + this.board[4] + this.board[6];
				break;
			}
			//Checking to see if concatX equals either 3 X's or 3 O's in a row.
			if (concatX.equals("OOO")) {
				return "O";
			} else if (concatX.equals("XXX")) {
				return "X";
			}
		}
		//Checking to see if it is a draw using the integer values of the this.board.
		for (int x = 1; x <= 9; x++) {
			//This check if there is a number.
			if(Arrays.asList(this.board).contains(String.valueOf(x))) {
				break;
			//This check to see if we're at the last position.
			} else if (x==9) {
				return "draw";
			}
		}
		return "";

	} 


}
