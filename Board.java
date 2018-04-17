public class Board {

    private int[][] board;     
    private int size;

    public Board(int[][] tiles) { // create a board from an n-by-n array of tiles,
                                  // where tiles[row][col] = tile at (row, col)
        size = tiles.length;
        board = new int[size][size];
        for (int i = 0; i < size(); i++) {
            for (int j = 0; j < size(); j++) {
                board[i][j] = tiles[i][j];
            }
        }
    }
    public String toString() { // string representation of this board
        String transformed = size() + "\n";
        for (int i = 0; i < size(); i++) {
            for (int j = 0; j < size(); j++) {
                transformed += board[i][j] + " ";
            }
            transformed += "\n"
        } 
    }

    public int tileAt(int row, int col) { // tile at (row, col) or 0 if blank
        return board[row][col];
    }

    public int size() { // board size n
        return size;
    }

    public int hamming() { // number of tiles out of place
    
    }

    public int manhattan() { // sum of Manhattan distances between tiles and goal
    
    }

    public boolean isGoal() { // is this board the goal board?
    
    }

    public boolean equals(Object y) { // does this board equal y?
    
    }

    public Iterable<Board> neighbors() { // all neighboring boards
    
    }

    public boolean isSolvable() { // is this board solvable?

    }
        
    public static void main(String[] args) { // unit testing (required)

    }
} 