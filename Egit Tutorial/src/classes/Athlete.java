package classes;

public class Athlete {
	
	private String FIRSTNAME;
	private String LASTNAME;
	private int jerseyNum;
	private String sport;
	
	// Athlete Constructor
	public Athlete(String firstname, String lastname, String sport) {
		// TODO Auto-generated constructor stub
		FIRSTNAME = firstname;
		LASTNAME = lastname;
		this.sport = sport;
		jerseyNum = 0;
	}
	

    public void setSport(String sport) {
    	this.sport = sport;
    }
    
    public void setJerseyNum(int num) {
    	jerseyNum = num;
	}
    
    public int getJersey() {
		return jerseyNum;
	}
    
    public String getName() {
		return FIRSTNAME + " " + LASTNAME;
	}
    
    public String getSport() {
		return sport;
	}
    
    
}
