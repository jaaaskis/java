package JavaExam;

import java.util.ArrayList;
import java.util.Scanner;

public class TeamProgram {
	
	public static class Team {
		
		private String name;
		private String country;
		private int wins;
		
		public Team(String name, String country, int wins) {
			this.name = name;
			this.country = country;
			this.wins = wins;
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public int getWins() {
			return wins;
		}
		public void setWins(int wins) {
			this.wins = wins;
		}
		
		public String toString() {
			
			String output = name + " (" + country + "): " + wins + " wins";
			
			return output;
		}
		
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Team> teamArray = new ArrayList<Team>();
		
		System.out.print("=== Enter teams (empty team name ends) === \n");
		while (true) {
			System.out.print("Enter team name: ");
			String teamName = input.nextLine();
			
			if(teamName.isEmpty()) {
				System.out.println();
				break;
			}
			
			System.out.print("Enter country: ");
			String teamCountry = input.nextLine();
			
			System.out.print("Enter wins: ");
			int teamWins = Integer.parseInt(input.nextLine());
			
			teamArray.add(new Team(teamName, teamCountry, teamWins));
			
			System.out.println();
			
		}
		
		System.out.println("=== All teams ===");
		
		for (int i = teamArray.size() - 1; i >= 0 ; i--) {
			System.out.println(teamArray.get(i).toString());
		}
		
		System.out.println("\n=== Search teams by country ===");
		
		System.out.print("Enter country: ");
		String search = input.nextLine();
		
		int searchmatches = 0;
		
		for (Team current : teamArray) {
			if(search.equalsIgnoreCase(current.getCountry())) {
				System.out.println(current.getName() + " (" + current.getWins() + " wins)");
				searchmatches++;
			}
		}
		
		if(searchmatches == 0) {
			System.out.print("*** There are no matches for this country ***");
		}
		
		input.close();

	}

}
