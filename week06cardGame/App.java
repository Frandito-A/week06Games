package week06cardGame;

public class App {

	public static void main(String[] args) {

			Card card = new Card("Queen", "Hearts", 12);
			card.describe();
			System.out.println(" ");
			//Prints the deck.
			System.out.println("Show me the Deck!");
			System.out.println("----------------");
			Deck deck = new Deck();
			deck.describe();
			System.out.println(" ");
			//Shuffle.
			System.out.println("May the cards shuffle!");
			System.out.println("---------------------");
			deck.cardShuffle();
			
	        Player player1 = new Player("Player 1");
	        Player player2 = new Player("Player 2");

	        // Shuffle the deck
	        deck.cardShuffle();
	        deck.describe();
	        System.out.println(" ");
	        System.out.println("Let us play!");
	        System.out.println("-----------");
	        //Card drawn = deck.draw();
			//drawn.describe();
	        for (int i = 0; i < 52; i++) {
	        	if(i % 2 == 0) {
	        		player1.draw(deck);
	        	} else {
	        		player2.draw(deck);
	        	}
	        	
	        }
	        //player1.describe();
	        //player2.describe();
	        for (int i = 0; i < 26; i++) {
	        	Card card1 = player1.flip();
	        	System.out.println(" ");
	        	Card card2 = player2.flip();
	        	
	        	card1.describe();
	        	card2.describe();
	        	
	        	if(card1.getValue() > card2.getValue()) {
	        		System.out.println("Player1 won!");
	        		player1.incrementScore();	        	
	        	} else if (card2.getValue() > card1.getValue()) {
	        		System.out.println("Player2 won!");
	        		player2.incrementScore();
	        	} else {
	        		
	        	}
	        }
	        System.out.println(" ");
	        if (player1.getScore() > player2.getScore()) {
	        	System.out.println("Player1 has won the game!" + " With the score of: " + player1.getScore());
	        
	        } else if (player2.getScore() > player1.getScore()) {
	        	System.out.println("Player2 has won the game!" + " With the score of: " + player2.getScore());
	        } else {
	        	System.out.println("Unfortunately it is a draw!" + " Player 1: " + player1.getScore() + " Player2: " + player2.getScore());
	        }

	}

}
