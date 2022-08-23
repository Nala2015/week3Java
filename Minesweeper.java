public class Minesweeper
{
    public static void main(String[] args)
    {
        int height = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        int numOfMines = Integer.parseInt(args[2]);
        String[][] grid = new String[height][width];
        while (numOfMines > 0)
        {
            int row = (int) (Math.random() * height);
            int col = (int) (Math.random() * width);
            if (grid[row][col] != "*")
            {
                grid[row][col] = "*";
                numOfMines -= 1;
            }
        }
        for (int r = 0; r < height; r++)
            {
                for (int c = 0; c < width; c++)
                {
                    int bombs = 0;
                    if ((r + 1) < height && (c + 1) < width)
                    {if (grid[r+1][c+1] == "*") bombs +=1;}
                    if ((r + 1) < height)
                    {if (grid[r+1][c] == "*") bombs += 1;}
                    if ((r + 1) < height && (c - 1) >= 0)
                    {if (grid[r+1][c-1] == "*") bombs += 1;}
                    if ((c+1) < width)
                    {if (grid[r][c+1] == "*") bombs += 1;}
                    if ((c+1) < width && (r-1) >= 0)
                    {if (grid[r-1][c+1] == "*") bombs += 1;}
                    if ((r-1) >= 0)
                    {if (grid[r-1][c] == "*") bombs += 1;}
                    if ((r-1) >= 0 && (c-1) >= 0)
                    {if (grid[r-1][c-1] == "*") bombs += 1;}
                    if ((c - 1) >= 0)
                    {if (grid[r][c-1] == "*") bombs += 1;}

                    if (grid[r][c] != "*")
                    grid[r][c] = Integer.toString(bombs);

                }

            }


        for (int i = 0; i < height; i++)
            {
                String x = "";
                for (int j = 0; j < width; j++) {x += grid[i][j]; x += "  ";}
                System.out.println(x);
            }


    }
}
