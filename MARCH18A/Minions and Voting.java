//https://www.codechef.com/MARCH18A/problems/MINVOTE
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
        try{
        int t=in.nextInt();
        while(t--!=0){
          int n=in.nextInt();
          long a[]=new long[n];
          long pre[]=new long[n];
          long max1=0,max=0;
          for(int i=0;i<n;i++){
            a[i]=in.nextLong();
          
          }
          if(n>2){
          long x=0,y=0;
          for(int i=0;i<n;i++){
            x=0;y=0;
            for(int j=i-1;j>=0;j--){
                
              if(a[i]>=y)
              pre[j]++;
              if(a[i]<y)
              break;
              y+=a[j];
              }
             for(int j=i+1;j<n;j++){
               
                if(a[i]>=x)
                pre[j]++;
                if(a[i]<x)
                break;
                x+=a[j];
                 
              }
          }
          
         
          for(int i=0;i<n;i++){
            st.append(pre[i]+" ");
          }
          }
          else if(n==2)
          st.append(1+" "+1);
          else if(n==1)
          st.append(0);
          st.append("\n");
          }
          
        System.out.print(st);
        }
        catch(Exception e){}
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
