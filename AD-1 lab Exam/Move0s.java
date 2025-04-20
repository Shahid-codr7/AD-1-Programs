import java.util.*;
public class Move0s 
{
    public static void main(String[] args) 
    {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        
    }
    public static void moveZeroes(int a[])
    {
        int x=0,n=a.length;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
                a[x]=a[i];
                x++;
            }
        }
        for(int i=x;i<n;i++)
        {
            a[i]=0;
        }

        for(int i=0;i<n;i++)
            System.out.print(a[i]+",");
    }
    
}
