import java.util.*;
public class Kpivot 
{
    public static void main(String[] args) 
    {
        int[] arr = {0,1,2,4,5,6,7};
        int k=3;

        KP(arr,k);
        
    }
    public static void KP(int a[],int k)
    {
        int n=a.length,c=0;
        int b[]=new int[n];
        for(int i=k;i<n;i++)
        {
            b[c++]=a[i];
        }

        for(int i=0;i<k;i++)
        {
            b[c++]=a[i];
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(b[i]+",");
        }
    }
    
}
