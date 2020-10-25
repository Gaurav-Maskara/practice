package io0.dream11;

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
		
		allPlayerPerformanceAndSelectionPercentage.add(new Player("m agarwal", "bat", 158, 91.06));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("s samson", "wk" , 123, 78.4));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("l rahul", "wk", 98.0, 87.68));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("m shami", "bowl" , 81, 76.09));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("r tewatia",  "all", 79, 64.44));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("s smith",  "bat", 73, 90.92));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("n pooran",  "wk" , 44, 22.68));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("t curran",  "bowl", 30, 25.98));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("m ashwin",  "bowl", 29, 22.39));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("j neesham",  "all", 27, 25.7));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("a rajpoot",  "bowl", 27, 10.51));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("s cottrell",  "bowl", 23, 63.85));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("g maxwell", "all",  17, 65.49));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("r uthappa",  "bat", 15, 48.02));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("j archer",  "bowl", 15, 80.79));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("s khan",  "bat", 12, 23.72));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("j buttler",  "wk", 8, 44.01));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("s gopal",  "bowl", 8, 18.27));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("k nair",  "bat", 4, 45.7));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("r bishnoi",  "bowl", 4.0, 54.02));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("r parag",  "all", 2.0, 12.01));
		allPlayerPerformanceAndSelectionPercentage.add(new Player("j unadkat", "bowl", 2, 11.21));
		
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
	}
	
	
	
	

}
