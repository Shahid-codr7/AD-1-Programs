//          KADANE'S ALGORITHM
public class LargestContSum 
{
    public static void main(String[] args) 
    {
        int arr[]={2, 3, -8, 7, -1, 2, 3};
        int i,res,maxSum;
        res=arr[0];
        maxSum=arr[0];
        for(i=1;i<arr.length;i++)
        {
            maxSum=maxSum+arr[i]; // Adding next with MaxSum
            maxSum=Math.max(maxSum, arr[i]);
            res=Math.max(res, maxSum);
        }
        System.out.println("LARGEST CONTIGUOUS SUM OF SUBARRAY = "+res);
    }

}
