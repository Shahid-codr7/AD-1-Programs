import java.util.*;

class Node2
{
    int value;
    Node2 next;
}

public class OddEven_LL
{
    public static void main(String[] args) 
    {
        Node2 startA=null, startB=null;
        startA=create(startA);
        startB=create(startB);
        // Create both LLs


        System.out.println("Original LL: ");

        display(startA);
        display(startB);
        
        Node2 p=startA;
        while(p!=null)
        {
            if(p.value%2!=0)
            {
                break;
            }
            p=p.next;
        }

        Node2 q=startB;
        while(q!=null)
        {
            if(q.value%2==0)
            {
                break;
            }
            q=q.next;
        }

        int temp=p.value;
        p.value=q.value;
        q.value=temp;

        System.out.println("Result:");
        display(startA);
        display(startB);

    }
    public static Node2 create(Node2 start) 
    {
        Scanner in=new Scanner(System.in);
        Node2 p=new Node2();
        Node2 q=null;
        char ch;
        do
        {
            p = new Node2();
            System.out.println("Enter value for Node2: ");
            p.value=in.nextInt();

            if(start==null)
            {
                start=p;
                q=p;
            }
            else
            {
                q.next=p;
                q=p;
            }
            System.out.println("Want to create more Node2s?");
            ch= in.next().charAt(0);

            in.close();
        }while(ch=='y' || ch=='Y');

        return start;
    }

    public static void display(Node2 start) 
    {
        if(start==null)
        {
            System.err.println("EMPTY");
            return;
        }
        else
        {
            Node2 p=start;
            while(p!=null)
            {
                System.out.print(p.value+"->");
                p=p.next;
            }
        }
    }
    
}
