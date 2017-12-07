public class UserOfPoint {
	public static void main (String[] args) {
		
		Point p0 = new Point(3.0, 0);
		Point p1 = new Point (0, 4.0);
		
		//confusion?
		p0.setAdjoinLimit(5.0);
		
		
		System.out.println(p0.adjoins(p1));
		p0.setAdjoinLimit(2.0);
		System.out.println(p0.adjoins(p1));// doesn't work, returns TRUE
	}
}
		