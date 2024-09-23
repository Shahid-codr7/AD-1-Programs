public class MaxMin 
{
    // Array Needs to be SORTED
    public static void main(String[] args) 
    {
        int A[]={-3, 1, 0, 4, 100, 99};
        int l=A.length;
        mergeSort(A,0,l-1);
        int i,big=A.length,small=0;
        int B[]=new int[big];
        big-=1;
        for(i=0;i<B.length;i++)
        {
            if(i%2==0)
            B[i]=A[big--];

            else
            B[i]=A[small++];

        }

        for(i=0;i<B.length;i++)
        {
            System.out.print(B[i]+" , ");
        }

        
    }
    // public static int[] Sort(int a[])
    // {
    //     int i,j,l=a.length;
    //     for(i=0;i<l-1;i++)
    //     {
    //         for(j=0;j<l-1-i;j++)
    //         {
    //             if(a[j]>a[j+1])
    //             {
    //                 int temp=a[j];
    //                 a[j]=a[j+1];
    //                 a[j+1]=temp;
    //             }
    //         }
    //     }
    //     return a;
    // } 
    public static void Merge(int arr[],int mid,int low,int high) 
    {
        int i,j,k;
        int B[]=new int[high+1];
        i=low;
        j=mid+1;
        k=low;
        while (i<=mid && j<=high) 
        {
            if(arr[i]<arr[j]) // '=' for stability
            {
                B[k++]=arr[i++];
            }
            else
            {
                B[k++]=arr[j++];
            }
        }
        while (i<=mid) 
        {
            B[k++]=arr[i++];
        }
        while (j<=high)
        {
            B[k++]=arr[j++];
        }

        for(i=low;i<=high;i++)
        {
            arr[i]=B[i];
        }

    }
    public static void mergeSort(int A[], int low, int high)
    {
        int mid;
        if(low<high)
        {
            mid=(low+high)/2;
            mergeSort(A, low, mid);
            mergeSort(A, mid+1, high);
            Merge(A, mid, low, high);
        }
    }
    
    
}
