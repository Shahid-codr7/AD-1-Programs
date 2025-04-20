import java.util.*;
public class Critical_Floor
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter no. of floors: ");
        int n = in.nextInt();
        System.out.println("Enter critical floor: ");
        int f = in.nextInt();
        System.out.println(BinSearch(n,f)+1);

    }
    public static int BinSearch(int n, int x) 
    {
        int c=0;
        int a[]= new int [n];
        for(int i=1; i<=n ; i++)
        {
            a[i-1]=i;
        }
        int low = 0, high = n-1, mid;
        while(low<high)
        {
            mid = (low+high)/2;
            if(x==a[mid])
            {
                return c;
            }
            else if(x >= a[mid+1])
            {
                low=mid+1;
                c++;
            }
            else 
            {
                high = mid;
                c++;
            }
            
        }
        return -1;
    }
}