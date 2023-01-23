import java.util.*;
public class quicksort {
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

    public static void quicks(int a[],int si,int ei)
    {
        if(si>=ei){
            return;
        }
       int pi= parti( a,si,ei);
       quicks(a,si,pi-1);
       quicks(a,pi+1,ei);
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
   quicks(a,0,a.length-1);
   for(i=0;i<n;i++)
   {
       System.out.print(a[i]);
   }
    
    }

}

