//https://www.codechef.com/APRIL18B/problems/AVGPR
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
         long a[]=new long[n];
         long max=0;
         long pos[]=new long[1001];
         long neg[]=new long[1001];
         for(int i=0;i<n;i++){
           a[i]=(in.nextLong());
           if(a[i]>=0)
           pos[(int)a[i]]++;
           else
           neg[(int)(Math.abs(a[i]))]++;
         }
         long ans=0;
        for(int i=-1000;i<1001;i++){
          for(int j=i;j<1001;j++){
            if(i>=0&&j>=0&&(i+j)%2==0){
              long k=(i+j)/2;
              if(i!=j){
              if(k*2==(long)(i+j))
              if(pos[(int)k]>0)
              ans+=pos[i]*pos[j];}
              else if(i==j){
                ans+=(pos[i]*(pos[i]-1))/2;
              }
            }
            else if(i<0&&j<0&&(i+j)%2==0){
              long k=(i+j)/2;
              if(i!=j){
                if(neg[(int)Math.abs(k)]>0)
                ans+=neg[Math.abs(i)]*neg[Math.abs(j)];
              }
              else if(i==j)
              ans+=(neg[Math.abs(i)]*(neg[Math.abs(i)]-1))/2;
            }
            else{
              if((i+j)%2==0&&i>=0){
                long k=(i+j)/2;
                if(k>=0&&pos[(int)k]>0)
                ans+=pos[i]*neg[Math.abs(j)];
                else if(k<0&&neg[(int)(Math.abs(k))]>0)
                ans+=pos[i]*neg[Math.abs(j)];
              }
              else if((i+j)%2==0&&j>=0){
                long k=(i+j)/2;
                if(k>=0&&pos[(int)k]>0)
                ans+=pos[j]*neg[Math.abs(i)];
                else if(k<0&&neg[(int)(Math.abs(k))]>0)
                ans+=pos[j]*neg[Math.abs(i)];
              }
            }
           
          }
        }
        
         st.append(ans+"\n");
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
