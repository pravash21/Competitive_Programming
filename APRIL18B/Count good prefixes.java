//https://www.codechef.com/APRIL18B/problems/GOODPREF
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.*;
class Main
{
  static long ca=0,cb=0;
  static long prefix(long ans1,String s){
     long ans2=ans1;
            for(int i=0;i<s.length();i++){
              if(s.charAt(i)=='a')
              ca++;
              else
              cb++;
              if(ca>cb)
              ans2++;
            }
            return ans2;
  }
    public static void main(String[] args)throws IOException
    {
        FastReader in=new FastReader(System.in);
        StringBuffer st=new StringBuffer();
        int t=in.nextInt();
        while(t--!=0){
         String s=in.next();
         int n=in.nextInt();
         int i=0;
         long ans1=0,ans2=0;
         ca=0;cb=0;
         for(i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(ch=='a')
           ca++;
           else
           cb++;
           if(ca>cb)
           ans1++;
         }
        if(ans1==0)
        st.append("0\n");
        else{
          if(ca==cb){
            for(i=2;i<=n;i++){
             ans2=prefix(ans1,s);
             if(ans2==ans1*2)
             break;
             else
             ans1=ans2;
           }
            i--;
            st.append((ans1+(ans2-ans1)*(n-i))+"\n"); 
            
          }
          else if(cb>ca){
           for(i=2;i<=n;i++){
             ans2=prefix(ans1,s);
             if(ans2==ans1)
             break;
             else
             ans1=ans2;
           }
            i--;
            st.append((ans1+(ans2-ans1)*(n-i))+"\n"); 
          }
          else if(ca>cb){
           ans2=0;
            for(i=2;i<=n;i++){
              ans2=prefix(ans1,s);
              if((ans2-ans1)==s.length()){
              break;}
              else
              ans1=ans2;
            }
            i--;
            st.append((ans1+((ans2-ans1)*(n-i)))+"\n");
          }
        }
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
