//https://www.codechef.com/JAN18/problems/RECTANGL
import java.util.*;
class Main {
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   StringBuffer st=new StringBuffer();
   while(t--!=0){
     int a[]=new int[4];
     for(int i=0;i<4;i++){
       a[i]=sc.nextInt();
     }
     Arrays.sort(a);
     if((a[0]==a[1])&&(a[2]==a[3]))
     st.append("YES");
     else
     st.append("NO");
     st.append("\n");
   }
   System.out.print(st);
  }
} 
