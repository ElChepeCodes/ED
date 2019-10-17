
package maze;

/**
 * MazeSearch demonstrates recursion.
 * @author Chase & Lewis
 */

public class MazeSearch {
    /**
    * Creates a new maze, prints its original form, attempts to
    * solve it (testing it and traversing it, and
    * prints out its final form.
    */
    public static void main (String[] args) {

        System.out.println("---- FIRST SAMPLE ----");
        int[][] grid1 = { {1,1,1},
                          {1,0,1},
                          {0,0,1} };
        Maze labyrinth1 = new Maze(grid1);
        System.out.println (labyrinth1);

        // Starting de Traverse
        if (labyrinth1.traverse(0, 0))
             System.out.println ("The maze was successfully traversed!");
        else
             System.out.println ("There is no possible path.");

        System.out.println (labyrinth1);
        
        
        System.out.println("---- SECOND SAMPLE ----");        
        int[][] grid2 = { {1,1,1,0,1,1,0,0,0,1,1,1,1},
                          {1,0,1,1,1,0,1,1,1,1,0,0,1},
                          {0,0,0,0,1,0,1,0,1,0,1,0,0},
                          {1,1,1,0,1,1,1,0,1,0,1,1,1},
                          {1,0,1,0,0,0,0,1,1,1,0,0,1},
                          {1,0,1,1,1,1,1,1,0,1,1,1,1},
                          {1,0,0,0,0,0,0,0,0,0,0,0,0},
                          {1,1,1,1,1,1,1,1,1,1,1,1,1} };
        Maze labyrinth2 = new Maze(grid2);
        System.out.println (labyrinth2);

        // Starting de Traverse
        if (labyrinth2.traverse(0, 0))
             System.out.println ("The maze was successfully traversed!");
        else
             System.out.println ("There is no possible path.");

        System.out.println (labyrinth2);
    }
}
