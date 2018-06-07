//https://www.codechef.com/MAY18A/problems/FAKEBS/
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.*;
class Main
{
  static long fuk_BS(long a[],long x,int f,int g,int p){
    int l=0,h=a.length-1;
    long k=0,y=0,z=0;
    int m=0,c=0;
    while(l<=h){
      m=(int)((l+h)/2);
     if(m==p)
      break;
     else if(m>p){
        
     if(a[m]>x)
     g--;
     else{
       z++;g--;
     }
     h=m-1;
      }
      else if(m<p){
        if(a[m]<x){
         f--;
        }
        else{
          y++;f--;
        }
        l=m+1;
        
      }
       if(f==-1||g==-1){
         y=-1;break;
       }
    }
    if(y==-1)
    return -1;
    else
    return (Math.max(y,z));
  }
    public static void main(String[] args)throws IOException
    {
        FastReader in=new FastReader(System.in);
        StringBuffer st=new StringBuffer();
        int t=in.nextInt();
        while(t--!=0){
          int n=in.nextInt();
          int q=in.nextInt();
          long a[]=new long[n];
          long b[]=new long[n];
          int c=0;
          HashMap<Long,Integer> hm=new HashMap<>();
            for(int i=0;i<n;i++){
              a[i]=in.nextInt();
              hm.put(a[i],i);
              b[i]=a[i];
            }
            Arrays.sort(b);
            int zz=0;
            while(q--!=0){
              long x=in.nextLong();
            int f=Arrays.binarySearch(b,x);
            
            long ans=fuk_BS(a,x,f,(n-1-f),hm.get(x));
            st.append(ans+"\n");
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
