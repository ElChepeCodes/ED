/**
 * Bingo demonstrates the use of a set collection.
 *
 * @author Lewis & Chase
 */

package bingosets;
import Sets.*;

public class Bingo {
  /**
   * Creates all 75 Bingo balls and stores them in a set. Then
   * pulls several balls from the set at random and prints them.
   */
    public static void main (String[] args) {
        final int NUM_BALLS = 75, NUM_PULLS = 10;
        ArraySet<BingoBall> bingoSet = new ArraySet<BingoBall>();
        BingoBall ball;

        for (int num = 1; num <= NUM_BALLS; num++) {
            ball = new BingoBall(num);
            bingoSet.add(ball);
        }

        System.out.println ("Size: " + bingoSet.size());
        System.out.println ();
        
        ArraySet<Character> premio= new ArraySet(30);

        System.out.println("Draws, randomly");
        for (int num = 1; num <= NUM_PULLS; num++) {
            ball = bingoSet.removeRandom();
            System.out.print(ball + ", ");
            premio.add(ball.getLetra());
        }
        System.out.println();
        
        if (premio.size()==5)
            System.out.println("HUBO PREMIO");
        else
            System.out.println("NO HUBO PREMIO");
    }
}
