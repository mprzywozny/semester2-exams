public class W4L3_2DArrays {
    public void random(int[][] grid, int count){
        int row, col;
        int placed = 0;

        //Create a loop which generates random positions in which your 1s will be placed
        //It will generate the 1s until it reaches the limit you have set(which is integer count)
        while(placed<count){

            //Generate random values for row and column, which are the positions in which 1s will be placed
            row = (int)(Math.random() * grid.length);
            col = (int)(Math.random() * grid[0].length);

            //If statement that checks if a 1 has already been placed in the given position.
            //If the spot is occupied, nothing happens and the program searches for another position to place the 1.
            //If the spot is not occupied, it puts a 1 there.
            //Then, integer placed increases by 1 and the whole process starts over.
            //It keeps doing so until it reaches the limit.
            if(grid[row][col] == 0){
                grid[row][col] = 1;
                placed++;
            }

        }

    }

}
