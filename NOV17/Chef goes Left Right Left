//https://www.codechef.com/NOV17/problems/CLRL/
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int n=0,r=0,min=0,max=0,i,j,k=0;
    boolean f=false;
    while(t--!=0){
      n=sc.nextInt();
      r=sc.nextInt();
      min=0;max=0;f=false;
      int a[]=new int[n];
      for(i=0;i<n-1;i++){
      a[i]=sc.nextInt();
        if(a[i]>max)
        max=a[i];
        if(a[i]<min)
        min=a[i];
      }
      a[n-1]=sc.nextInt();
      for(i=0;i<n-1;i++){
        if(a[i]>r){
          if(a[i]<=max)
          max=a[i];
          else if(a[i]>max){
            f=true;
            break;
          }
        }
        if(a[i]<r){
          if(a[i]>=min)
          min=a[i];
          else if(a[i]<min){
            f=true;
            break;
          }
        }
      }
      if(f==false)
      System.out.println("YES");
      else
      System.out.println("NO");
    }
  }
} 
