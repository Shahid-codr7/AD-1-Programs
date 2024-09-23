public class RotatebyKpos 
{
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,5,6};
        int l=arr.length;
        int k=3;
        System.out.println("Original array: ");
        printarr(arr);
        reverse(arr,0,l-1);
        System.err.println("WORKING BACKEND: ");
        printarr(arr);
        reverse(arr,k,l-1);
        printarr(arr);
        reverse(arr,0,k-1);
        printarr(arr);
        System.out.println("ROTATED array: ");
        printarr(arr);
    }
    public static void reverse(int a[],int start,int end) 
    {
        int temp=0;
        while(start<end)
        {
            temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    public static void printarr(int a[]) 
    {
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println();   
    }
    
}
