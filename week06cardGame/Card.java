package week06cardGame;

public class Card {
	int value;
	String name;
	String suit;
	
	public String getSuit() {
		return suit;
	}


	public void setSuit(String suit) {
		this.suit = suit;
	}


	//constructor.
	public Card (String name, String suit, int value) {
		this.name = name;
		this.value = value;
		this.suit = suit;
	}
	
	
	//getters & setters
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//describe method.
	public void describe () {
		System.out.println(this.name + " of " + this.suit +  " -- " + this.value);
	}

}
