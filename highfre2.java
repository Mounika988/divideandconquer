import java.util.*;
public class highfre2 {
    public static int count(int a[],int num,int si,int ei){
        int count=0;
        int i;
        for(i=si;i<=ei;i++){
if(a[i]==num){
    count++;
}
}
return count;
        }

    public static int maj(int a[],int si,int ei)
    {
        int max;
        if(si==ei)
        {
            return a[si];
        }
        int mid=si+(ei-si)/2;
        int left=maj(a,si,mid);
        int right=maj(a,mid+1,ei);
        System.out.println("left is"+left);
        System.out.println("right is"+right);
        if(left==right){
            return left;
        }
        System.out.println("si is"+si);
        System.out.println("ei is"+ei);
        int leftcount=count(a,left,si,ei);
        int rightcount=count(a,right,si,ei);
        
         System.out.println("leftcount is"+leftcount);
        System.out.println("right count is"+rightcount);

        return leftcount>rightcount?left:right;
    }
    public static int majo(int a[],int si,int ei)
    {
        return maj(a,0,a.length-1);
    }
    
    public static void main(String[] args)
    {
    int i;
    Scanner sc =new Scanner(System.in);
    int n;
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.print("Enter the numbers:");
    for(i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    int t;
    /*System.out.print("give target:");
    t=sc.nextInt();*/
   System.out.println(majo(a,0,a.length-1));
   for(i=0;i<n;i++)
   {
       System.out.print(a[i]);
   }
    
    }

}


