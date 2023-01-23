import java.util.*;
public class mergesort {
    public static int merge(int a[],int mid,int si,int ei)
    {
        int temp[]=new int[ei-si+1];
       int i=si;
       int j=mid+1;
       int k=0;
       int inv=0;
       while(i<=mid && j<=ei )
       {
        if(a[i]<a[j])
        {
        temp[k]=a[i];
        i++;
        }
        else{
            temp[k]=a[j];
            j++;
            inv++;
        }
        k++;
       }
       while(i<=mid)
       {
        temp[k++]=a[i++];
       }
       while(j<=ei)
       {
        temp[k++]=a[j++];
       }
       for(k=0,i=si;k<temp.length;k++,i++)
       {
           a[i]=temp[k];
       }
return inv;
    }

    public static int mergesorti(int a[],int si,int ei)
    {
        int invc=0;
        if(ei>si)
        {
         int mid=si+(ei-si)/2;
         invc=mergesorti(a,si,mid);
         invc+=mergesorti(a,mid+1,ei);
        invc+=merge(a,mid,si,ei);
        }
        return invc;

    }
    
    public static void main(String[] args)
    {
    int i;
    Scanner sc =new Scanner(System.in);
    int a[]=new int[5];
    int n;
    n=sc.nextInt();
    System.out.print("Enter the numbers:");
    for(i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
   System.out.println(mergesorti(a,0,a.length-1));

    for(i=0;i<5;i++)
    {
        System.out.print(a[i]);
    }

    }

}
