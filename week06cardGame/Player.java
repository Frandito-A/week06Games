 
package week06cardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand;
	private int score;
	private String name;
	
	public Player (String name) {
		this.hand = new ArrayList<>();
		this.score = 0;
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void describe() {
		
		System.out.println("Player " + name);
		
		System.out.println("Score: " + score);
		
		System.out.println("Hand: ");
		for (Card card : hand) {
			card.describe();
		}
	} 
	
	public Card flip() {
		if (!hand.isEmpty()) {
			return hand.remove(0);
		} else {
			return null;
		}
	}
	
	public void draw (Deck deck) {
		Card card = deck.draw();
		if (card != null) {
			hand.add(card);
		}
	}
	
	public void incrementScore() {
		score += 1;
	}

}
