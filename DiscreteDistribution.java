public class DiscreteDistribution
{
    public static void main(String[] args)
    {
        double sum = 0.0;
        for (int i = 1; i < args.length; i++)
            sum += Integer.parseInt(args[i]);
        double[] probs = new double[args.length - 1];
        probs[0] = Integer.parseInt(args[1])/sum;
        for (int j = 1; j < probs.length; j++)
            probs[j] =Integer.parseInt(args[j+1])/sum + probs[j-1];
        String res = "";
        for (int n = 0; n < Integer.parseInt(args[0]); n++)
        {
            double chance = Math.random();
            for (int m = 0; m < probs.length; m++)
            {
                if (chance < probs[m])
                {
                    res = res + ((m+1) + " ");
                    break;
                }

            }
        }
        System.out.println(res);
    }
}

