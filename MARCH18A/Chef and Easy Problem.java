//https://www.codechef.com/MARCH18A/problems/XXOR
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
        int n=in.nextInt();
        int q=in.nextInt();
        int a[]=new int[n];
        int bin[][]=new int[n][31];
        for(int i=0;i<n;i++){
          a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
          String p=Integer.toBinaryString(a[i]);
          for(int j=0;j<31;j++){
            if(j>=p.length()){
              if(i>0)
            bin[i][j]=bin[i-1][j]+1;
            else
            bin[i][j]++;
            }
            else{
            if(p.charAt(p.length()-1-j)=='0'){
              if(i>0)
            bin[i][j]=bin[i-1][j]+1;
            else
            bin[i][j]++;
            }
            else{
              if(i>0)
            bin[i][j]=bin[i-1][j]-1;
            else
            bin[i][j]--;
            }
            }
          }
        }
        while(q--!=0){
          int l=in.nextInt();
          int r=in.nextInt();
          int c=0,max=0,s=0,ans=0,x=0;
         
         for(int i=0;i<31;i++){
           if(l>1)
           x=bin[r-1][i]-bin[l-2][i];
           else
           x=bin[r-1][i];
           if(x>0)
           ans+=Math.pow(2,i);
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
