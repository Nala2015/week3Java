public class ThueMorse
{
    public static void main(String[] args)
    {
        int size = Integer.parseInt(args[0]);
        String[][] matrix = new String[size][size];
        matrix[0][0] = "+  ";
        for (int i = 1; i < size; i++)
        {
            int m = 0;
            while(Math.pow(2,m) < (i+1)) m++;
            m -= 1;
            int opp = i - ( (int) Math.pow(2,m));
            if (matrix[0][opp] == "+  ") matrix[0][i] = "-  ";
            else matrix[0][i] = "+  ";
            matrix[i][0] = matrix[0][i];
        }

        for (int i = 1; i < size; i++)
        {
            for (int j = 1; j < size; j++)
            { if (matrix[i][0] == matrix[j][0]) matrix[i][j] = "+  ";
              else matrix[i][j] = "-  ";
            }

        }

        for (int i = 0; i < size; i++)
        {
            String str = "";
            for (int j = 0; j < size; j++) str += matrix[i][j];
            System.out.println(str);

        }
    }
}
