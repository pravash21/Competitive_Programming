//https://www.codechef.com/NOV17/problems/CHEFHPAL/
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t--!=0){
      int n=sc.nextInt();
      int a=sc.nextInt();
      if(a==1){
        StringBuffer st=new StringBuffer();
        for(int i=0;i<n;i++)
        st.append("a");
        System.out.println(n+" "+st);
      }
      else if(a>2){
        int i=0;
        StringBuffer st=new StringBuffer();
        while(i<n){
          for(int j=0;j<a;j++){
            i++;
            if(j==a)
            j=0;
          st.append((char)(97+j));
          if(i==n)
          break;
          }
        }
        System.out.println("1 "+st);
      }
      else if(a==2){
        if(n==1)
        System.out.println("1 a");
        else if(n==2)
        System.out.println("1 ab");
        else if(n==3)
        System.out.println("2 aab");
        else if(n==4)
        System.out.println("2 aabb");
        else if(n==5)
        System.out.println("3 aaabb");
        else if(n==6)
        System.out.println("3 aaabab");
        else if(n==7)
        System.out.println("3 aaababb");
        else if(n==8)
        System.out.println("3 aaababbb");
        else if(n>8){
          StringBuffer st=new StringBuffer();
          int x=n/3,i=0;
          for(i=0;i<x;i++)
          if(i%2!=0)
          st.append("baa");
          else
          st.append("bba");
          if(i%2==0){
            for(int j=0;j<n-(i*3);j++)
            if(j==0)
            st.append("b");
            else if(j==1)
            st.append("b");
            else if(j==2)
            st.append("a");
          }
          else{
             for(int j=0;j<n-(i*3);j++)
            if(j==0)
            st.append("b");
            else if(j==1)
            st.append("a");
            else if(j==2)
            st.append("a");
          }
          System.out.println("4 "+st);
        }
      }
      }
    }
  }
