import java.util.*;

class Node1
{
    int value;
    Node1 next;
}

public class AppendAt_2nd
{
    public static void main(String[] args) 
    {
        Node1 startA=null, startB=null;
        startA=create(startA);
        startB=create(startB);
        // Create both LLs


        System.out.println("Original LL: ");

        display(startA);
        display(startB);
        
        if(startA.next==null) //check if List1 has less than 2 elements
        {
            startA.next=startB;
        }
        else
        {
            Node1 tail=startB; //find tail of head2
            while(tail.next!=null)
                tail=tail.next;

            tail.next=startA.next.next;
            startA.next.next=startB;
        }

        System.out.println("Resulted LL: ");
        display(startA);

    }


    public static Node1 create(Node1 start) 
    {
        Scanner in=new Scanner(System.in);
        Node1 p;
        Node1 q=null;
        char ch;
        do
        {
            p = new Node1();
            System.out.println("Enter value for Node1: ");
            p.value=in.nextInt();
            p.next=null;

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
            System.out.println("Want to create more Node1s?");
            ch= in.next().charAt(0);

        }while(ch=='y' || ch=='Y');

        return start;
    }

    public static void display(Node1 start) 
    {
        if(start==null)
        {
            System.err.println("EMPTY");
            return;
        }
        else
        {
            Node1 p=start;
            while(p!=null)
            {
                System.out.print(p.value+"->");
                p=p.next;
            }
            System.out.println();
        }
    }
    
}
