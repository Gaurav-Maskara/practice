package io0.dream11_28_sep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@ToString
public class Dream11 {

	private Map<Double, String> batsmen = new TreeMap<Double, String>(Collections.reverseOrder());
	private Map<Double, String> bowlers = new TreeMap<Double, String>(Collections.reverseOrder());
	private Map<Double, String> wicketKeeeper = new TreeMap<Double, String>(Collections.reverseOrder());
	private Map<Double, String> allRounder = new TreeMap<Double, String>(Collections.reverseOrder());
	private Map<Double, String> myDreamTeam = new LinkedHashMap<Double, String>();
	private Map<Double, String> dreamTeamSelectedByIndia = new TreeMap<Double, String>(Collections.reverseOrder());
    private List<Player> allPlayerPerformanceAndSelectionPercentage = new ArrayList<Player>();
	
	public Dream11() {
		allPlayerPerformanceAndSelectionPercentage();
		
		addBatsmen();
		addBowlers();
		addWicketKeeper();
		addAllRounder();
		
		//getIndiaDream11TeamBy1Keeper5Batsmen1All4Bowler(); // by different player types
		  getIndiaDream11TeamBySelectionPercentage(); // only by selection percentage
		//getIndiaDream11TeamBy1Keeper5Batsmen2All3Bowler();
	}

	public void addBatsmen() {
		for (Player p : allPlayerPerformanceAndSelectionPercentage) {
			if(p.getPlayerType().equalsIgnoreCase("bat")) {
				batsmen.put(p.getChosenByPercentage(), p.getName());
			}
		}
	}

	public void addBowlers() {
		for (Player p : allPlayerPerformanceAndSelectionPercentage) {
			if(p.getPlayerType().equalsIgnoreCase("bowl")) {
				bowlers.put(p.getChosenByPercentage(), p.getName());
			}
		}
	}

	public void addWicketKeeper() {
		for (Player p : allPlayerPerformanceAndSelectionPercentage) {
			if(p.getPlayerType().equalsIgnoreCase("wk")) {
				wicketKeeeper.put(p.getChosenByPercentage(), p.getName());
			}
		}
	}

	public void addAllRounder() {
		for (Player p : allPlayerPerformanceAndSelectionPercentage) {
			if(p.getPlayerType().equalsIgnoreCase("all")) {
				allRounder.put(p.getChosenByPercentage(), p.getName());
			}
		}
	}

	public double getMyDreamTeamScore() {

		double totalScore = 0;
		Set<Double> keySet = myDreamTeam.keySet();
		String name = "";
	
		int captainAndViceCaptain = 1;
		double pointsScored = 0;
		
		for(double d : keySet) {
				name = myDreamTeam.get(d);
				for(Player p : allPlayerPerformanceAndSelectionPercentage) {
					if(p.getName().equalsIgnoreCase(name)) {
						pointsScored = p.getPointsScored();
						break;
					}
				}
				
 				System.out.println(name + " " + d + " "+ pointsScored);
				
				if(captainAndViceCaptain == 1) {
					totalScore = totalScore + (2* pointsScored);
				}
				else if(captainAndViceCaptain == 2) {
					totalScore = totalScore + (1.5* pointsScored);
				}
				else {
					totalScore = totalScore +  pointsScored;
				}
				captainAndViceCaptain++;
		}
		return totalScore;
	}

	public void addPlayerByName(String name) {
		for(Player p : allPlayerPerformanceAndSelectionPercentage) {
			if(p.getName().equalsIgnoreCase(name)) {
				myDreamTeam.put(p.getChosenByPercentage(), p.getName());
				return;
			}
		}
		throw new RuntimeException();
	}

	public void getIndiaDream11TeamBy1Keeper5Batsmen1All4Bowler() {

		// 1 wk
		// 3 bat
		// 1 ar
		// 3 bwl
		
		// 1, 5 , 1, 4

		Set<Double> wicketKeeperPreference = wicketKeeeper.keySet();
		Set<Double> batsmenPreference = batsmen.keySet();
		Set<Double> allRounderPreference = allRounder.keySet();
		Set<Double> bowlersPrefence = bowlers.keySet();

		int temp = 0;
		for (double d : wicketKeeperPreference) {
			dreamTeamSelectedByIndia.put(d, wicketKeeeper.get(d));
			temp++;
			if (temp >= 1) {
				break;
			}
		}

		temp = 0;
		for (double d : batsmenPreference) {
			dreamTeamSelectedByIndia.put(d, batsmen.get(d));
			temp++;
			if (temp >= 5) {
				break;
			}
		}

		temp = 0;
		for (double d : allRounderPreference) {
			dreamTeamSelectedByIndia.put(d, allRounder.get(d));
			temp++;
			if (temp >= 1) {
				break;
			}
		}

		temp = 0;
		for (double d : bowlersPrefence) {
			dreamTeamSelectedByIndia.put(d, bowlers.get(d));
			temp++;
			if (temp >= 4) {
				break;
			}
		}
	}
	
	public void getIndiaDream11TeamBy1Keeper5Batsmen2All3Bowler() {

		// 1 wk
		// 3 bat
		// 1 ar
		// 3 bwl
		
		// 1, 5 , 1, 4

		Set<Double> wicketKeeperPreference = wicketKeeeper.keySet();
		Set<Double> batsmenPreference = batsmen.keySet();
		Set<Double> allRounderPreference = allRounder.keySet();
		Set<Double> bowlersPrefence = bowlers.keySet();

		int temp = 0;
		for (double d : wicketKeeperPreference) {
			dreamTeamSelectedByIndia.put(d, wicketKeeeper.get(d));
			temp++;
			if (temp >= 1) {
				break;
			}
		}

		temp = 0;
		for (double d : batsmenPreference) {
			dreamTeamSelectedByIndia.put(d, batsmen.get(d));
			temp++;
			if (temp >= 5) {
				break;
			}
		}

		temp = 0;
		for (double d : allRounderPreference) {
			dreamTeamSelectedByIndia.put(d, allRounder.get(d));
			temp++;
			if (temp >= 2) {
				break;
			}
		}

		temp = 0;
		for (double d : bowlersPrefence) {
			dreamTeamSelectedByIndia.put(d, bowlers.get(d));
			temp++;
			if (temp >= 3) {
				break;
			}
		}
	}
	
	public void allPlayerPerformanceAndSelectionPercentage() {
		
		
		allPlayerPerformanceAndSelectionPercentage.add(new Player("q de kock", "wk", 19, 87.52));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("r sharma", "bat" , 22, 82.34));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("a de villiers", "bat", 87, 81.22));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("y chahal", "bowl" , 23, 75.65));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("s dube",  "all", 38, 67.87));
		
		
		allPlayerPerformanceAndSelectionPercentage.add(new Player("v kohli",  "bat", 1, 64.97));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("s yadav",  "bat" , 2, 64.71));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("a finch",  "bat", 73, 62.30));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("j bumrah",  "bat", 0, 64.14));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("a finch",  "bat", 0, 58.01));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("c lynn",  "bat", 0, 3.49));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("d padikal",  "bat", 0, 46.11));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("s tiwary", "bat",  0, 27.87));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("p deshpande",  "bat", 0, 0.87));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("s rutherford",  "bat", 0, 0.8));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("g singh mann",  "bat", 0, 0.72));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("a singh",  "bat", 0, 0.43));
		
		
		// all rounder
		allPlayerPerformanceAndSelectionPercentage.add(new Player("h pandya",  "all", 0, 18.74));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("k nair",  "all", 0, 48.66));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("r bishnoi",  "all", 0, 56.2));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("r parag",  "all", 0, 12.5));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("j unadkat", "all", 0, 11.52));
		// all rounder
		
		
		// bowler
		allPlayerPerformanceAndSelectionPercentage.add(new Player("s gopal",  "bowl", 0, 18.74));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("k nair",  "bat", 0, 48.66));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("r bishnoi",  "bowl", 0, 56.2));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("r parag",  "all", 0, 12.5));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("j unadkat", "bowl", 0, 11.52));
		// bowler
		
		
		
		
		
	}
	
	public double getIndiaDream11TeamScore() {
		double totalScore = 0;
		Set<Double> keySet = dreamTeamSelectedByIndia.keySet();
		String name = "";
	
		int captainAndViceCaptain = 1;
		double pointsScored = 0;
		
		System.out.println(dreamTeamSelectedByIndia);
		
		
		for(double d : keySet) {
				name = dreamTeamSelectedByIndia.get(d);
				for(Player p : allPlayerPerformanceAndSelectionPercentage) {
					if(p.getName().equalsIgnoreCase(name)) {
						pointsScored = p.getPointsScored();
						break;
					}
				}
				
				System.out.println(name + " " + d + " "+ pointsScored);
				
				if(captainAndViceCaptain == 1) {
					totalScore = totalScore + (2* pointsScored);
				}
				else if(captainAndViceCaptain == 2) {
					totalScore = totalScore + (1.5* pointsScored);
				}
				else {
					totalScore = totalScore +  pointsScored;
				}
				captainAndViceCaptain++;
		}
		
		return totalScore;
	}
	
	
	
	public void getIndiaDream11TeamBySelectionPercentage() {
		Collections.sort(allPlayerPerformanceAndSelectionPercentage, new PlayerComparator());

		for (int i = 0; i <= 10; i++) {
			dreamTeamSelectedByIndia.put(allPlayerPerformanceAndSelectionPercentage.get(i).getChosenByPercentage(),
					allPlayerPerformanceAndSelectionPercentage.get(i).getName());
		}
       System.out.println(allPlayerPerformanceAndSelectionPercentage);
	}
	
	
	
	

}
