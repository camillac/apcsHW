public class UserOfTwoDimensions {
	public static void main(String[] args) {
	
		Point p0 = new Point(5.3 , 2.6);
		Point pnew = new Point(7.0 , 3.6);
		
		p0.setAdjoinLimit(3.6 , 5.9);
		System.out.println(p0.getXaxisAdjoinLimit());
		System.out.println(p0.getYaxisAdjoinLimit());
		System.out.println(p0.ADJOINS(pnew));
	}
}