public class Rec_LeastPos 
{
    public static void main(String[] args) 
    {
        int a[]={1,2,3,4,9,17};
        // Array Needs to be SORTED
        System.out.println("Least +ve Missing no. = "+Miss_No(a,1,0));
    }   
    public static int Miss_No(int a[], int n, int i) 
    {
        if(i==a.length)
        return n;
        else
        {
            if(a[i]==n)
            {
                return Miss_No(a, n+1, i+1);
            }
            else
            return Miss_No(a, n, i+1);
        }
    }
}
