//https://www.codechef.com/DEC17/problems/CPLAY/
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
String s;
int i =0;
while (true){
   if(sc.hasNextLine()==false)
   break;
   s = sc.nextLine();
        int a=0,b=0,p1=0,p2=0,c=0;
        for(i=0;i<10;i++){
          if(i%2==0){
            p1=((i+1)/2)+1;
            p2=(i+1)/2;
          }
          else{
            p1=(i+1)/2;
            p2=(i+1)/2;
          }
            if(s.charAt(i)=='1'){
              if(i%2==0)
            a++;
            else
            b++;
            }
            if((a+(5-p1))<b){
            System.out.println("TEAM-B "+(i+1));
            c=1;break;
            }
            if((b+(5-p2))<a){
            System.out.println("TEAM-A "+(i+1));
              c=1;break;
            }
        }
        if(c==0){
          for(i=10;i<20;i++){
            if(s.charAt(i)=='1'){
              if(i%2==0)
            a++;
            else
            b++;
            }
            if(i%2!=0)
            if(a>b){
              System.out.println("TEAM-A "+(i+1));
              break;
            }
            else if(b>a){
              System.out.println("TEAM-B "+(i+1));
              break;
            }
          }
          if(a==b)
          System.out.println("TIE");
        }
}
  }
} 
