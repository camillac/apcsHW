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
	
	public void setSleepHour(int hours) {
		sleepHours = hours;
	}
	
	public int getSleepHour() {
		return sleepHours;
	}
    
    public String toString() {
        return firstName + " " + osis
             + " slept for " + sleepHours;
    }
	
	public void augmentSleepHours( int addendum ) {
		if (addendum >= 0)
			sleepHours += addendum;
		else
			
}