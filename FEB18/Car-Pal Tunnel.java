//https://www.codechef.com/FEB18/problems/CARPTUN
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
         int a[]=new int[n];
         for(int i=0;i<n;i++){
           a[i]=in.nextInt();
         }
         int c=in.nextInt();
         int d=in.nextInt();
         int s=in.nextInt();
         double time=(double)d/(double)s;
         double m=0.0,x=1.0,y=0.0,delay1=0.0,delay2=0.0;
         for(int i=0;i<n;i++){
           if((double)a[i]>m)
           m=(double)a[i];
           delay1=x+(double)a[i]+time;
           x=delay1;
           delay2=delay1+m;
         }
         st.append((double)((delay2-delay1)*(c-1)));
         st.append("\n");
        }
        System.out.print(st);
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
