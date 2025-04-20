import java.util.*;

class Node
{
    int marks;
    Node next;
}
public class LinkedList 
{
    static Node start=null;
    public static void create()
    {
        Scanner in = new Scanner(System.in);
        Node p=new Node();
        Node q=null;
        int ch;
        do
        {   
            System.out.println("Enter marks: ");
            p.marks=in.nextInt();
            
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
            System.out.println("Want to add more nodes?");
            ch=in.next().charAt(0);

        }while(ch=='y'||ch=='Y');
           
    }

    public static void display() 
    {
        Node p=start;
        if(start==null)
        {
            System.out.println("EMPTY LL");
        }
        while(p!=null)
        {
            System.out.println(p.marks+"->");
            p=p.next;
        }
    }
    
    // public static void InsBeg() 
    // {
    //     Scanner sc=new Scanner(System.in);
    //     Node p=new Node();
    //     System.out.println("Enter marks: ");
    //     p.marks=sc.nextInt();
    //     p.next=start;
    //     start=p;
    // }

    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter List1: ");
        create();
    }
}
