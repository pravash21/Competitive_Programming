//https://www.codechef.com/JAN18/problems/PRTITION
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.*;
class Main
{
    public static void main(String[] args)throws IOException
    {
        FastReader in=new FastReader(System.in);
        int t=in.nextInt();
        StringBuffer st=new StringBuffer("");
   while(t--!=0){
    int x=in.nextInt();
    int n=in.nextInt();
    long sum=((long)n*((long)n+1))/2-(long)x;
    if(sum%2!=0)
    st.append("impossible");
   else{
     long k=sum/2;
      if(n-1==1||n-1==2)
      st.append("impossible");
      else{
        StringBuffer s=new StringBuffer("");
      for(int i=n;i>=1;i--){
        if(i==x)
        s.append("2");
        else{
          if(i<=k&&k>0){
            k-=i;
            if(k<n&&k==x){
            s.append("0");
            k+=i;
            }
            else
              s.append("1");
          }
          else
          s.append("0");
        }
      }
      st.append(s.reverse());
    }
   }
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
