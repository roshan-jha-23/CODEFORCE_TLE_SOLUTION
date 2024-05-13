import java.util.HashMap;
import java.util.Scanner;

public class DoremysPaint3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            int n=sc.nextInt();
            int [] arr=new int[n];
            HashMap<Integer,Integer>map=new HashMap<>();
            boolean flag=true;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
                if(map.size()>2){
                    flag=false;
                }
            }
            if(map.size()==2){
                int f1 = map.values().iterator().next(); // freq of first element
                if (f1 != n / 2 && f1 != (n + 1) / 2)
                    flag = false;
            }

           if(flag) System.out.println("Yes");
           else System.out.println("No");

        }
    }
}
