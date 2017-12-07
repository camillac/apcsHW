public class Student {
    public String firstName;
    public        int osis;
    public static int nextOsis;
    
    // track Student's sleep habits
    private int sleepHours;
    
    // constructors
    public Student() {
        osis = nextOsis;
        nextOsis = nextOsis + 1;
    }
    public Student( String nameParam ) {
        this();
        firstName = nameParam;
    }
	
	// setter + getter for private
	
	public void setSleepHour(int hours) {
		if (hours >= 0)
			sleepHours = hours;
		else
			sleepHours = -1;
	}
	
	public int getSleepHour() {
		return sleepHours;
	}
    
	// toString
	
    public String toString() {
		if (!(sleepHours == -1))
			return firstName + " " + osis
			+ " slept for " + sleepHours
			+ ", feeling " + sleepCategory();
		else
			return "Error: You can't sleep negative hours silly";
    }
	
	// additional methods
	
	public void augmentSleepHours( int addendum ) {
		if (addendum >= 0 && sleepHours >= 0)
			sleepHours += addendum;
		else
			sleepHours = -1;
	}
	
	public String sleepCategory() {
		if (sleepHours == 0)
			return "dead";
		else if (sleepHours > 0 && sleepHours <= 5)
			return "drowsy";
		else if (sleepHours > 5 && sleepHours <= 9)
			return "fine";
		else if (sleepHours > 24)
			return "incredibly rejuvinated";
		else
			return "well-rested";
	}
}