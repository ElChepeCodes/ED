/**
 * BingoBall represents a ball used in a Bingo game.
 *
 * @author Lewis & Chase
 */

package bingosets;

public class BingoBall {
  private char letter;
  private int number;
  private char [] letNum = {'B', 'I', 'N', 'G', 'O'};
  
  /**
   * Sets up this Bingo ball with the specified number and the
   * appropriate letter.
   */
  
  public char getLetra(){
      return letter;
  }
    //Constructor
    public BingoBall (int num) {
        number = num;
        if (num!=0)
            num--;
        int div=(num)/15;
        switch(div){
            case(0): letter='B';break;
            case(1): letter='I';break;
            case(2): letter='N';break;
            case(3): letter='G';break;
            case(4): letter='O';break;
        }//switch
    
    }

  /**
   * Returns a string representation of this bingo ball.
   */
    public String toString () {
        return (letter + " " + number);
    }
}
