import java.util.*;
public class strmergesort {
    public static void merge(String a[],int mid,int si,int ei)
    {
        String temp[]=new String[ei-si+1];
       int i=si;
       int j=mid+1;
       int k=0;
       while(i<=mid && j<=ei )
       {
        if( a[i].compareTo(a[j])<0)
        {
        temp[k]=a[i];
        i++;
        }
        else{
            temp[k]=a[j];
            j++;
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

    }

    public static void mergesort(String a[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
         int mid=si+(ei-si)/2;
         mergesort(a,si,mid);
         mergesort(a,mid+1,ei);
         merge(a,mid,si,ei);
    }
    
    public static void main(String[] args)
    {
    int i;
    Scanner sc =new Scanner(System.in);
    String a[]=new String[5];
    int n;
    n=sc.nextInt();
    System.out.print("Enter the numbers:");
    for(i=0;i<n;i++)
    {
        a[i]=sc.next();
    }
    mergesort(a,0,a.length-1);

    for(i=0;i<5;i++)
    {
        System.out.println(a[i]);
    }

    }

}

