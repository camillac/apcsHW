public class Fence {
    
    // for basic loop practice:
    public static int sumThrough(int num){
		int n = 0;
		int sum = 0;
		while (n < num) {
			sum += n + 1;
			n += 1;
		}
		return sum;
	}
    
	//fields
	private int railNum = 0;
	private String body = "X";
	
    public Fence( int railsParam){
		if (railsParam >= 0) {
			while (railNum < railsParam) {
				body += "--|";
				railNum += 1;
			}
		}
		
    }

    // Produce the output specified in UserOfFence.
    public String toString() {
		return body;
	}
}