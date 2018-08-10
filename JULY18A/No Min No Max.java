//https://www.codechef.com/JULY18A/problems/NMNMX/
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.*;
class Main
{
  static long mod=1000000007;
 static long power(long n,long m){
  if(m==0){
    return 1;
  }
  if(m%2==1){
    return ((n%mod)*power((n*n)%mod,m/2))%mod;
  }
  else{
    return power((n*n)%mod,m/2);
  }
}
    public static void main(String[] args)throws IOException
    {
        FastReader in=new FastReader(System.in);
        StringBuffer st=new StringBuffer();
        long b[][]=new long[5001][5001];
        for(int i=0;i<=5000;i++){
         b[i][0]=1;
         b[0][i]=0;
       }
       b[0][0]=1;
       for(int i=1;i<=5000;i++){
       	for(int j=1;j<=i;j++){
       	    b[i][j]=(b[i-1][j-1]%(mod-1)+b[i-1][j]%(mod-1))%(mod-1);	
             
       	}
       }
        int t=in.nextInt();
        while(t--!=0){
          int n=in.nextInt();
          int k=in.nextInt();
          long a[]=new long[n];
          long c[]=new long[n];
          for(int i=0;i<n;i++){
            a[i]=in.nextLong();
          }
          Arrays.sort(a);
         for(int i=1;i<n;i++){
            long f=0;
           for(int j=1;j<k-1;j++){
           	if(i>=j&&((n-i)>=(k-j))){
           		long x=b[i][j];
             long y=b[n-i-1][k-j-1];            
            long z=(x%(mod-1)*y%(mod-1));
            f=(f+z)%(mod-1);
           	}
           }
           c[i]=f;
       }
       long ans=1;
       for(int i=0;i<n;i++){
            long res=power(a[i]%mod,c[i]%(mod-1))%mod;
            ans=(ans%(mod)*res%(mod))%(mod);
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
