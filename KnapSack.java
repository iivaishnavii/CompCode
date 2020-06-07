class KnapSack{

    static int max_profit= 0;
    private static void knap(int[] weights,int[] profits,int capacity,int profit,int index){
        if(profit > max_profit && capacity >= 0) max_profit = profit;
      
        if(index >= weights.length) return ;

        if(capacity < 0 ) return ;

        

        //Choosing
        knap(weights,profits,capacity-weights[index],profit+profits[index],index+1);
        //Not choosing
        knap(weights,profits,capacity,profit,index+1);
        
        

    }

    private static int knapSack(int capacity,int[] profit,int[] weight,int n){
        int[][] dp = new int[n+1][capacity+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=capacity;j++){
                if(j<weight[i-1]){
                    dp[i][j] = dp[i-1][j];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],profit[i-1]+dp[i-1][j-weight[i-1]]);
                }
            }
        }

        return dp[n][capacity];
    }


    public static void main(String[] args){
        int[] weights = { 2,3,5};
        int[] profits = {1,2,6};

        knap(weights,profits,8,0,0);
        System.out.println(max_profit);
        //int p = knapSack(10, profits, weights, 3);
        //System.out.println(p);

    }
}