/******************************************************************************
 * Exercise the Fence class
 ******************************************************************************/

public class UserOfFence {

    public static void main(String[] commandLine) {

        // for basic loop practice:
        System.out.println( Fence.sumThrough(  3) + " ...expecting  6 \n"
                           + Fence.sumThrough( 10) + " ...expecting 55 \n"
                           + Fence.sumThrough(  0) + " ...expecting  0 \n"
                          );
        //needs Fence.toString()
        Fence f;
        f = new Fence(3);
        System.out.println( f + " ...expecting X--|--|--|");

        f = new Fence(1);
        System.out.println( f + " ...expecting X--|");

        f = new Fence(0);
        System.out.println( f + " ...expecting X");
    }
}