package io0.dream11_28_sep;

import java.util.Comparator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Player {

	private String name;
	private double pointsScored;
	private double chosenByPercentage;
	private String playerType;

	
	public Player(String name, String playerType , double pointsScored, double chosenByPercentage) {
		this.name = name;
		this.pointsScored = pointsScored;
		this.chosenByPercentage = chosenByPercentage;
		this.playerType = playerType;
	}

}

class PlayerComparator implements Comparator<Player> {
	public int compare(Player p1, Player p2) {
		
		double diff = p1.getChosenByPercentage() - p2.getChosenByPercentage();
		diff = Math.ceil(diff);
		return (int) ((-1)*diff);
	}
}
