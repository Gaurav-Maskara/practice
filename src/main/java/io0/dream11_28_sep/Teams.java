package io0.dream11_28_sep;

public class Teams {
	
	
	
	public static void main(String args[]) {

		Dream11 dreamTeam = new Dream11();
		
		dreamTeam.addPlayerByName("m agarwal");
		dreamTeam.addPlayerByName("s samson");
		dreamTeam.addPlayerByName("n pooran");
		dreamTeam.addPlayerByName("l rahul");
		dreamTeam.addPlayerByName("r uthappa");
		dreamTeam.addPlayerByName("s smith");
		dreamTeam.addPlayerByName("j neesham");
		dreamTeam.addPlayerByName("r tewatia");
		dreamTeam.addPlayerByName("m ashwin");
		dreamTeam.addPlayerByName("m shami");
		dreamTeam.addPlayerByName("t curran");
		
		
		System.out.println("My Chosen dream team score ---> " + dreamTeam.getMyDreamTeamScore());
		//System.out.println("India Dream 11 Team score ---> " + dreamTeam.getIndiaDream11TeamScore());
		
		
	}
	

}
