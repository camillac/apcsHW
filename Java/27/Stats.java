public class Stats {
	public static int    mean( int a,    int b) {
		return (a + b) / 2;
	}
	public static double mean( double a, double b) {
		return (a + b) / 2;
	}

	public static int    max( int a,    int b) {
		if (a >= b)
			return a;
		else
			return b;
	}
	
	public static double max( double a, double b){
		if (a >= b)
			return a;
		else
			return b;
	}
	

	public static int    geoMean( int a,    int b) {// geometric mean
		return (int) Math.sqrt( a * b );
	}
		
	public static double geoMean( double a, double b) {
		return Math.sqrt( a * b );
	}
}