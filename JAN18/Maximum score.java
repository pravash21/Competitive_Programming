//https://www.codechef.com/JAN18/problems/MAXSC
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
    int n=in.nextInt();
    int a[][]=new int[n][n];
    for(int i=0;i<n;i++){
      int b[]=new int[n];
      
      for(int j=0;j<n;j++){
        b[j]=in.nextInt();
      }
      Arrays.sort(b);
      for(int j=0;j<n;j++){
        a[i][j]=b[j];
      }
    }
    long k=a[n-1][n-1],sum=k;
    int f=0,j=0;
    for(int i=n-2;i>=0;i--){
      j=0;f=0;
      for(j=n-1;j>=0;j--){
      if(a[i][j]<k){
      sum+=a[i][j];
      k=a[i][j];break;
      }
      }
      if(j==-1){
      f=1;break;
      }
    }
    if(f==0)
    st.append(sum);
    else
    st.append(-1);
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
