public class Computer extends Player {

    public Computer(String token) {

        super("Bit Bucket", token);
    }

    //************ ALGORITHM #4 ***************
    // very basic random move algorithm for now
    // how should the computer decide how to move?

    //me and Tenzin tried alot lot to get this algorithm to work but couldnt :(
    public int determineMove() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 5; col++) {
                if (grid[row][col].equals("X")
                        && grid[row][col+1].equals("X")
                        && grid[row][col+2].equals("X")) {
                        if (grid[row][col + 3].equals("-")) {
                        if ((grid[row + 1][col + 4].equals("X")) || (grid[row + 1][col + 4].equals("O"))) {
                            return (col+4);
                        }
                    }
                    if (grid[row][col - 1].equals("-")) {
                        if ((grid[row + 1][col - 1].equals("X")) || (grid[row + 1][col + 1].equals("O"))) {
                            return (col - 1);
                        }
                    }

                }
            }
        }
        int col = (int )(Math.random() * 8);
        return col;
    }

}