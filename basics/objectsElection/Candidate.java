package objectsElection;

public class Candidate {
	
	private String name;
	private int votes;
	
	public Candidate(String name) {
		this.name = name;
		this.votes = 0;
	}

	public String getName() {
		return name;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

}
