//https://www.codechef.com/FEB18/problems/CHEFPTNT
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
         int m=in.nextInt();
         int x=in.nextInt();
         int k=in.nextInt();
         String s=in.next();
         int ev=0,od=0;
         for(int i=0;i<k;i++){
           if(s.charAt(i)=='E')
           ev++;
           else
           od++;
         }
         int d=0;
         for(int i=1;i<=m;i++){
           if(n<=0)
           break;
           if(i%2!=0){
             if(od!=0){
             if(od>=x){
               od-=x;n-=x;
             }
             else if(x>od){
               n-=od;od=0;
             }
             }
           }
           else{
             if(ev!=0){
             if(ev>=x){
               ev-=x;n-=x;
             }
             else if(x>ev){
               n-=ev;ev=0;
             }
             }
           }
         }
         if(n<=0)
         st.append("yes\n");
         else
         st.append("no\n");
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
