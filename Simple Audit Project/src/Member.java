
public class Member extends Person {

	private int ID;

	public Member() {
		super();
		this.setID(0);
	}

	public Member(String name, int ID) {
		super(name);
		this.setID(ID);
	}

	private void setID(int ID) {
		this.ID = ID;
	}

	public int getID() {
		return this.ID;
	}
	
	public String toString() {
		return super.toString() + " - ID: " + this.getID();
	}
	
}
