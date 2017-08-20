int sumInRange(int[] nums, int[][] queries) {

    int[] sum = new int[nums.length];
    
    for(int i=0;i<nums.length;i++){
        if(i==0)
            sum[i]=nums[i];
        else{
            sum[i]=sum[i-1]+nums[i];
        }
    }
    long rangeSum=0; // Test cases 12 and 13 are bigger than integer but their modulos are fitting into int
    for(int i=0;i<queries.length;i++){
         if(queries[i][0]==0)
             rangeSum+= sum[queries[i][1]];
        else{   
         rangeSum += sum[queries[i][1]] - sum[queries[i][0]-1];
        }
    }
    int returning = (int) Math.floorMod(rangeSum , 1000000007 );
    return returning;
}
