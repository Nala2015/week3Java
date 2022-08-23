public class Birthday
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double[][] matrix = new double[n+1][3];
        for (int i = 0; i < (n+1); i++)
            matrix[i][0] = (i+1);
        for (int j = 0; j < trials; j++)
        {
            int numPeople = 0;
            boolean[] found = new boolean[n];
            int birth = (int) (Math.random() * n);
            while (!found[birth])
            {
               found[birth] = true;
               birth = (int) (Math.random() * n);
               numPeople += 1;
            }
            matrix[numPeople][1] += 1;
        }

        double total = 0;
        for (int p = 0; p <= n; p++)
        {
            total += matrix[p][1];
            matrix[p][2] = total/trials;
        }
        int t = 0;
        while(matrix[t][2] < 0.5) t+= 1;
        t += 1;

        for (int m = 0; m < t; m++)
        {
            int first = (int) matrix[m][0];
            int second = (int) matrix[m][1];
            if (first < 10)
                System.out.println(first + "     " + second + "   " + matrix[m][2]);
            else
                System.out.println(first + "    " + second +  "   "  +  matrix[m][2]);
        }

    }


}
