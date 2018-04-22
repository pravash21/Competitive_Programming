//https://www.codechef.com/DEC17/problems/CHEFHAM
import java.util.*;
import java.io.*;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t--!=0){
      int n=sc.nextInt();
      int z=0;
      int a[]=new int[n];
      int b[]=new int[n];
      for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      b[i]=a[i];
      }
      int k=n,j=0;
      for(int i=0;i<n-1;i++){
        int te=b[i+1];
        b[i+1]=b[i];
        b[i]=te;
        if(b[i]==a[i])
        {
          if(i+2<n){
            te=b[i];
          b[i]=b[i+2];
          b[i+2]=te;
          }
          else{
            te=b[i];
          b[i]=b[0];
          b[0]=te;
          }
        }
      }
      int temp=0;
      if(n>1){
      if(b[n-1]==a[n-1]){
        temp=b[1];
        b[1]=b[n-1];
        b[n-1]=temp;
      }
      if(b[0]==a[0]){
        temp=b[0];
        b[0]=b[1];
        b[1]=temp;
      }
      }
      for(j=0;j<n;j++){
      if(b[j]==a[j]){
      z++;
      }
      }
      if(n==1){
      System.out.println(n-z);
      System.out.print(b[0]);
      }else{
      System.out.println(n-z);
      for(int i=0;i<n;i++)
      System.out.print(b[i]+" ");
      }
      System.out.println();
    }
  }
}  
