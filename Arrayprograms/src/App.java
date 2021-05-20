
import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> li=new ArrayList<Integer>();
        int i;
        int n,a;
        System.out.println("Enter the size of arraylist");
        n=sc.nextInt();
        System.out.println("Enter the elements in an arrayList");
        for(i=0;i<n;i++)
        {
            a=sc.nextInt();
            li.add(a);
        }
        int endingmax=li.get(0);
        int maxfar=li.get(0);
        for(i=1;i<li.size();i++)
        {
            endingmax=Math.max(li.get(i),li.get(i)+endingmax);
            maxfar=Math.max(maxfar,endingmax);
        }
        System.out.println("The maximum sum of a contiguous array is"+maxfar);


        
    }
}
