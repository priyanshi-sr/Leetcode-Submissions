class Solution {
    int N;
    int[][][] dp = new int[100005][2][3];
    public int checkRecord(int n) {
        N = n;
        for(int i=0;i<100005;i++)
        {
            for(int j=0;j<2;j++)
            {
                for(int k=0;k<3;k++)
                {
                    dp[i][j][k] = -1;
                }
            }
        }
        return find(0, 0, 0);
    }

    public int find(int i, int noOfA, int noOfC)
    {
        if(i == N)
        {
            return 1;
        }
        if(dp[i][noOfA][noOfC] != -1)
        {
            return mod(dp[i][noOfA][noOfC]);
        }

        int count = mod(find(i+1, noOfA, 0)); 
        mod(count);
        if(noOfA == 0)
        {
            count = mod(mod(count) + mod(find(i+1, 1, 0))); // A
        }
        if(noOfC < 2)
        {
            count = mod(mod(count) + mod(find(i+1, noOfA, noOfC+1))); //C
            mod(count);
        }
        dp[i][noOfA][noOfC] = count;
        return count;
    }

    int mod(int c)
    {
        return c%=1000000007;
    }
}