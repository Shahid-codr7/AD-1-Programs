import java.util.Scanner;

public class SecurityGuard 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the standard height: ");
        int h=in.nextInt();
        System.out.println("Enter the number of candidates: ");
        int n=in.nextInt();
        int c=0;
        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the heights of candidate "+(i+1)+":");
            a[i]=in.nextInt();
        }
        
        int maxcount=0;
        int maxval=0;
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                }
            }
            
            if(maxcount < c)
            {
                maxcount=c;
                maxval=a[i];
            }
        }

        System.out.println("Most Common: "+(maxval+h));
    }
    
}

