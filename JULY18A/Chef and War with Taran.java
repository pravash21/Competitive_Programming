//https://www.codechef.com/JULY18A/problems/WARTARAN/
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.*;
class Main
{
    public static void main(String[] args)throws IOException
    {
        FastReader in=new FastReader(System.in);
        StringBuffer st=new StringBuffer();
        int t=in.nextInt();
        while(t--!=0){
         int n=in.nextInt();
         int a=in.nextInt();
         int b=in.nextInt();
         int ar[]=new int[n];
         int d[]=new int[n];
         int c=0;int sum=0;
         int arr[][]=new int[n][n];
         for(int i=0;i<n;i++){
           c=0;
           for(int j=0;j<n;j++){
             arr[i][j]=in.nextInt();
             if(arr[i][j]==1)
             c++;
           }
           ar[i]=c;
           sum+=ar[i];
         }
         int z=(int)(n/(a+b));
          
         outer: while(true){
           if(sum<=n)
           break outer;
           for(int i=n-1;i>=0;i--){
             if(sum<=n)
             break outer;
             if(ar[i]!=0){
             ar[i]-=1;
             sum-=1;
             }
           }
         }
         for(int i=0;i<n;i++)
         System.out.print(ar[i]+" ");
         System.out.println();
         System.out.flush();
         for(int i=0;i<n;i++)
         d[i]=in.nextInt();
         int r=0,p=0,max=0,min=Integer.MAX_VALUE;
        for(int w=1;w<=z;w++){
         for(int y=1;y<=a;y++){
           r=0;p=0;max=0;min=Integer.MAX_VALUE;
           for(int i=0;i<n;i++){
             if(ar[i]>max){
               max=ar[i];r=i;
             }
           }
           for(int i=n-1;i>=0;i--){
             if(d[i]!=0&&d[i]<min){
               min=d[i];p=i;
             }
           }
             System.out.println((r+1)+" "+(p+1));
             System.out.flush();
             ar[r]--;d[p]--;
             
         }
         for(int y=1;y<=b;y++){
           int u=in.nextInt();
           int v=in.nextInt();
           ar[u-1]--;d[v-1]--;
         }
         }
         System.out.flush();
          }
          
        //System.out.print(st);
    }
    static class FastReader{
 
        byte[] buf = new byte[2048];
        int index, total;
        InputStream in;
 
        FastReader(InputStream is) {
            in = is;
        }
 
        int scan() throws IOException {
            if (index >= total) {
                index = 0;
                total = in.read(buf);
                if (total <= 0) {
                    return -1;
                }
            }
            return buf[index++];
        }
 
        String next() throws IOException {
            int c;
            for (c = scan(); c <= 32; c = scan());
            StringBuilder sb = new StringBuilder();
            for (; c > 32; c = scan()) {
                sb.append((char) c);
            }
            return sb.toString();
        }
 
        int nextInt() throws IOException {
            int c, val = 0;
            for (c = scan(); c <= 32; c = scan());
            boolean neg = c == '-';
            if (c == '-' || c == '+') {
                c = scan();
            }
            for (; c >= '0' && c <= '9'; c = scan()) {
                val = (val << 3) + (val << 1) + (c & 15);
            }
            return neg ? -val : val;
        }
 
        long nextLong() throws IOException {
            int c;
            long val = 0;
            for (c = scan(); c <= 32; c = scan());
            boolean neg = c == '-';
            if (c == '-' || c == '+') {
                c = scan();
            }
            for (; c >= '0' && c <= '9'; c = scan()) {
                val = (val << 3) + (val << 1) + (c & 15);
            }
            return neg ? -val : val;
        }
    }
}       
 
