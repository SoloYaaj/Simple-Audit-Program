
public class Leader extends Member {
	private int term;

	public Leader() {
		super();
		this.setTerm(0);
	}

	public Leader(String name,int ID, int term) {
		super(name, ID);
		this.setTerm(term);
	}

	private void setTerm(int term) {
		this.term = term;
	}

	public int getTerm() {
		return this.term;
	}

	@Override()
	public String toString() {
	return super.toString() + " - Term: " + this.getTerm() + " ";
	}
	
}
