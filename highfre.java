import java.util.*;
public class highfre {
    public static int highfr(int a[])
    {
       //int max=Integer.MIN_VALUE;
       int max=a.length/2;
       int i,j;
       int c=0;
       int k=0;
       for(i=0;i<a.length;i++)
       {
        c=0;
        for(j=0;j<a.length;j++)
        {
           if(a[i]==a[j]){
            c++;
           }
        }
       if(c>=max){
       return a[i];
    }
}
return -1;
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
   System.out.println("element is"); 
   System.out.println(highfr(a));
   
    }

}

