public class LeastPosMissNo 
{
    public static void main(String[] args)  
    {
        int arr[]={1, 2, -3, 5, 99, 4};
        int i,j,l=arr.length,flg=0;
        int max=Integer.MIN_VALUE;
        for(i=0;i<l;i++)
        max=Math.max(max, arr[i]);

        for(i=1;true;i++)
        {
            for(j=0;j<l;j++)
            {
                if(arr[j]==i)
                {
                    flg=1;
                    break;
                }
            }
            if(flg==0)
            {
                System.out.println(i);
                break;
            }
            flg=0;
        }
    }
    
}
