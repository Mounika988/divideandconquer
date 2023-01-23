import java.util.*;
public class rotatesort{
    public static int parti(int a[],int si,int ei)
    {
        int pivot=a[ei];
        int i=si-1;
        int j;
        int temp;
        for(j=si;j<ei;j++){
            if(a[j]<=pivot){
                i++;
temp=a[i];
a[i]=a[j];
a[j]=temp;
            }
        }
        i=i+1;
        temp=pivot;
        a[ei]=a[i];
        a[i]=temp;
        return i;
    }

    public static int search(int a[],int si,int ei,int t)
    {
        int mid=si+(ei-si)/2;
        int i=0;
        if(t==a[mid])
        {
            return mid;
        }
        if(a[si]<=a[mid]){
            if(a[si]<=t && t<=a[mid])
            {
               return search( a,si,mid-1,t); 
            }
            else{
                return search( a,mid+1,ei,t); 
            }

        }
        else{
            if(a[mid+1]<=t && t<=a[ei])
            {
               return search( a,mid+1,ei,t); 
            }
            else{
                return search( a,si,mid,t); 
            }

        }

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
    int t;
    System.out.print("give target:");
    t=sc.nextInt();
    System.out.print(search(a,0,a.length-1,t));

    
    }

}