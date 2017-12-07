public class School{
    public static void main(String[] args) {
        // occupant of seat 0
        Student s0;
        s0 = new Student();
        s0.sleepHours = s0.sleepHours + 8;

        // combine steps, but with nothing new
        s0.firstName = "Clifford"; // Brown

        System.out.println( s0 );
        
        // similar results, slightly different actions
        Student s1 = new Student("Helen"); // Merrill
        System.out.println( s1 );
        
        // another reference to an existing instance
        Student leader;
        leader = s0;
        System.out.println( leader );
        
        // ax one reference
        s0 = null;
        System.out.println( s0 );
    }
}