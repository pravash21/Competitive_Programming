//https://www.codechef.com/NOV17/problems/PERPALIN/
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int n=0,p=0,i=0,j=0;
    while(t--!=0){
      n=sc.nextInt();
      p=sc.nextInt();
      if(n<3||p<3)
      System.out.println("impossible");
      else{
        StringBuffer s=new StringBuffer();
        for(i=0;i<n/p;i++){
        if(p%2==0){
          
          StringBuffer st=new StringBuffer();
          for(j=0;j<p/2-1;j++)
          st.append("a");
          st.append("b");
          s.append(st);
          s.append(st.reverse());
      }
      else{
         for(j=0;j<p/2;j++)
         s.append("a");
         s.append("b");
         for(j=0;j<p/2;j++)
         s.append("a");
      }
        }
      System.out.println(s);
    }
    
  }
}
} 
