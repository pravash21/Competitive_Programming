//https://www.codechef.com/NOV17/problems/VILTRIBE
import java.util.*;
import java.io.*;
public class Main{
  public static void main(String args[])throws IOException{
    Scanner sc=new Scanner(System.in);
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    String s="";
    int i,j,k=0,x=0,a=0,b=0;
    while(t--!=0){
      s=br.readLine();
      a=0;b=0;x=0;
      for(i=0;i<s.length();i++){
        if(s.charAt(i)=='A'){
          a+=1;
          k=s.indexOf('A',i+1);
          x=0;
         for(j=i+1;j<k;j++)
          if(s.charAt(j)!='.'){
            x=1;
            break;
          }
          if(x==0&&k>-1)
          a+=(k-i-1);
        }
        x=0;
        if(s.charAt(i)=='B'){
          b+=1;
          k=s.indexOf('B',i+1);
          x=0;
          for(j=i+1;j<k;j++)
          if(s.charAt(j)!='.'){
            x=1;break;
          }
          if(x==0&&k>-1)
          b+=(k-i-1);
        }
      }
      System.out.println(a+" "+b);
    }
  }
} 
