//https://www.codechef.com/FEB18/problems/CHEFCHR
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
         String s=in.next();
         int n=s.length();
         if(n==1||n==2||n==3)
         st.append("normal");
         else{
           int c=0;
           for(int i=0;i<n-3;i++){
             if(s.charAt(i)=='c'||s.charAt(i)=='h'||s.charAt(i)=='e'||s.charAt(i)=='f'){
               int h1=0,h2=0,h3=0,h4=0;
               for(int j=i;j<i+4;j++){
                 if(s.charAt(j)=='c')
                 h1++;
                 else if(s.charAt(j)=='h')
                 h2++;
                 else if(s.charAt(j)=='e')
                 h3++;
                 else if(s.charAt(j)=='f')
                 h4++;
               }
               if(h1==1&&h2==1&&h3==1&&h4==1)
               c++;
             }
           }
           if(c==0)
           st.append("normal");
           else
           st.append("lovely "+c);
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
