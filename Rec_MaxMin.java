public class Rec_MaxMin 
{
    public static void main(String[] args) 
    {
        int a[]={1,-4,3,7,2,99,0,56};
        System.out.println(Max(a,Integer.MIN_VALUE,a.length-1));
        System.out.println(Min(a,Integer.MAX_VALUE,a.length-1));
        
    }
    public static int Max(int a[], int max,int l) 
    {
        if(l==-1)
        return max;
        else if(a[l]>max)
            return Max(a,a[l],l-1);
            else
            return Max(a, max, l-1);
        
    }
    public static int Min(int a[], int min,int l) 
    {
        if(l==-1)
            return min;
        else if(a[l]<min)  
            return Min(a,a[l],l-1);
        else
            return Min(a, min, l-1);
        
    }
    
}
