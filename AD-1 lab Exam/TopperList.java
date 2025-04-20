import java.util.*;
public class TopperList 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of students: ");
        int n = in.nextInt();
        String[] name = new String[n];
        int[] marks = new int[n];
        System.out.println("Enter name of " + n + " students: ");

        for (int i=0 ; i<n ;i++)
        {
            name[i]=in.next();
        }
        System.out.println("Enter marks of " + n + " students: ");

        for (int i=0;i<n;i++)
        {
            marks[i]=in.nextInt();
        }

        //Sorting

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(marks[j]<marks[j+1])
                {
                    int temp1= marks[j];
                    String tempn= name[j];
                    marks[j]=marks[j+1];
                    name[j]=name[j+1];
                    marks[j+1]=temp1;
                    name[j+1]=tempn;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(name[i]+" "+marks[i]);
        }

        System.out.println("TOPPER LIST:");
        int x=marks[0];
        for(int i=0;i<n;i++)
        {
            if(marks[i]==x)
            {
                System.out.print(name[i]+" ");
            }
        }

    }
    
}
