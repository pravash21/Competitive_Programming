//https://www.codechef.com/APRIL18B/problems/HIGHWAYC
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
          double s=(double)(in.nextLong());
          double y=(double)(in.nextLong());
          double v[]=new double[n];
          double d[]=new double[n];
          double p[]=new double[n];
          double c[]=new double[n];
          for(int i=0;i<n;i++){
            v[i]=(double)(in.nextLong());
          }
           for(int i=0;i<n;i++){
            d[i]=(double)(in.nextLong());
          }
           for(int i=0;i<n;i++){
            p[i]=(double)(in.nextLong());
          }
           for(int i=0;i<n;i++){
            c[i]=(double)(in.nextLong());
          }
          double a=0,b=0,curr=0,ans=0,tim=y/s;
          for(int i=0;i<n;i++){
            if(((p[i]>=0)&&(p[i]-c[i]>=0)&&(d[i]==1))||((p[i]<=0)&&(p[i]+c[i]<=0)&&(d[i]==0))){
              ans+=tim;continue;
            }
            if(i>0){
              curr=b*v[i];
              double dist=Math.abs(p[i])-0.000001-curr;
              p[i]=dist;
             if(p[i]<0){
             c[i]=c[i]+p[i];
             p[i]=0;
            if(c[i]<0)
             c[i]=0;
             }
            }
            double x1=Math.abs(p[i])-0.000001;
            a=(x1/v[i]);
            if(a<=tim){
            ans+=((x1+c[i])/v[i]);
            }
            ans+=tim;
            b=ans;
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
