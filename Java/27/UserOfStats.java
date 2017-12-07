public class UserOfStats {
	public static void main(String[] args) {
		System.out.println(Stats.mean(5 , 7));
		System.out.println(Stats.mean(3.2 , 7.2));
		System.out.println(Stats.max(2, 30));
		System.out.println(Stats.max(20.3, 20.4));
		System.out.println(Stats.geoMean(4, 7));
		System.out.println(Stats.geoMean(10.0, 3.0));
	}
}