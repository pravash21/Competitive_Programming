//https://www.codechef.com/DEC17/problems/GIT01
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t--!=0){
      int n=sc.nextInt();
      int m=sc.nextInt();
      long ans=0,ans2=0;
      String s="";
      char u='G',v='R';
        for(int i=0;i<n;i++){
          s=sc.next();
          if(i%2==0){
            u='R';v='G';
          }
          else{
            u='G';v='R';
          }
          for(int j=0;j<m;j++){
            if(j%2==0){
              if(s.charAt(j)!=u)
              if(u=='R')
              ans+=3;
              else
              ans+=5;
            }
            else{
              if(s.charAt(j)!=v)
              if(v=='R')
              ans+=3;
              else
              ans+=5;
            }
            if(j%2==0){
              if(s.charAt(j)!=v)
              if(v=='G')
              ans2+=5;
              else
              ans2+=3;
            }
            else{
              if(s.charAt(j)!=u)
              if(u=='G')
              ans2+=5;
              else
              ans2+=3;
            }
          }
        }
      System.out.println(Math.min(ans,ans2));
    }
  }
}  
