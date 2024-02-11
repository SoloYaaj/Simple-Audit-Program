import java.util.ArrayList;

public class Org {
	private String name;
	private ArrayList<Member> Members;
	private Leader Leader;

	public String getName() {
		return this.name;
	}

	private void setName(String name) {
		this.name = name;

	}

	public Org(String orgName, String leaderName ,int ID, int term) {
		this.setName(orgName);
		this.Leader = new Leader(leaderName,ID, term);
		this.Members = new ArrayList<Member>();
	}

	public void addMember(Member member) {
		this.Members.add(member);
	}

	public void orgAudit() {
		System.out.println("Organization\'s Name: " + this.getName());
		System.out.println("\tLeader\'s Name: " + this.Leader.toString());
		for (Member Members : Members)
			System.out.println("\t\t" + Members.toString());
	}
	
}
