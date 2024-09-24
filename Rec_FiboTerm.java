public class Rec_FiboTerm 
{
    public static void main(String[] args) 
    {
        int n=5;
        System.out.println(n+"th term  of Fibonacci series is "+fibo(n));
    }
    public static int fibo(int n)
    {
        if(n==1)
        return 0;
        else if(n==2)
        return 1;
        else
        return fibo(n-1)+fibo(n-2);
    }
    
}
