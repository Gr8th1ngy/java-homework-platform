package voteCount;

public class VoteCount {
	private char[] votes;
	private int A;
	private int B;
	
	public VoteCount(int noOfVotes){
		votes=new char[noOfVotes];
	}
	public void setVotes (String votes){
		for (int i=0; i<this.votes.length; i++){
			this.votes[i]= votes.charAt(i);
		}
	}
	public String result(){
		for (int i=0; i<this.votes.length; i++){
			if (votes[i]=='A'){
				A++;
			} else {
				B++;
			}
		}
		if (A>B){
			return "A wins";
		} else if (B>A){
			return "B wins";
		} else {
			return "It's a tie";
		}
	}
}
