package oops.pr;

public class Monster {
	protected String name;
	
	public Monster(String name) {
		this.name=name;
	}
	
	public String attack() {
		return "I don't know how to attack!";
	}
}
