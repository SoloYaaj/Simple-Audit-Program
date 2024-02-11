
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Org TopScholars = new Org("TopScholars", "Nikki", 14, 2);
		Org Foodies = new Org("Foodies","Ronald", 234, 2);
		TopScholars.addMember(new Member("Sean",15));
		TopScholars.addMember(new Member("Abby",16));
		TopScholars.addMember(new Member("Justin",17));
		Foodies.addMember(new Member("Sean", 235));
		Foodies.addMember(new Member("Lisa", 236));
		Foodies.addMember(new Member("Tina",237));
		TopScholars.orgAudit();
		System.out.println("");
		System.out.println("");
		System.out.println("");
		Foodies.orgAudit();
	}
	}


