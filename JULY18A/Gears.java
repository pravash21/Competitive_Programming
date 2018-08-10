//https://www.codechef.com/JULY18A/problems/GEARS/
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.*;
class Main
{
  static int n;
  static int a[];
  static int b[];
  static int dad[];
  static int son[];
  static long gcd(long a,long b){   
    if (a == 0)
        return b;
    return gcd(b%a, a);
  }
 static int parent(int x){
    if(dad[x]<0)
    return x;
    int cx=find(x);
    dad[x]=parent(dad[x]);
    int p=find(dad[x]);
    if(cx!=p)
    son[x]=1;
    else
    son[x]=0;
    return dad[x];
  }
 static int find(int x){
    if(dad[x]<0)
    return 0;
    else
    return son[x]^find(dad[x]);
  }
  static void reverse(int x){
    for(int i=1;i<=n;i++){
      if(parent(i)==x){
      if(son[i]==0)
      son[i]=1;
      else
      son[i]=0;}
    }
  }
 static void connect(int x,int y){
    int dx=parent(x);
    int dy=parent(y);
    int cx=find(x);
    int cy=find(y);
    if(dx==dy){
      if(cx==cy)
      b[dx]=1;
    }
    else{
      if(b[dy]==1||b[dx]==1){
        b[dx]=1;b[dy]=1;
      }
      else if(cx==cy){
        if(dad[dx]>dad[dy])
        son[dx]^=1;
        else
        son[dy]^=1;
        
      }
      if(dad[dx]<=dad[dy]){
        dad[dx]+=dad[dy];
        dad[dy]=dx;
      }
      else{
        dad[dy]+=dad[dx];
        dad[dx]=dy;
      }
    }
  }
    public static void main(String[] args)throws IOException
    {
        FastReader in=new FastReader(System.in);
        StringBuffer st=new StringBuffer();
        a=new int[100010];
        b=new int[100010];
        dad=new int[100010];
        son=new int[100010];
        n=in.nextInt();
        int m=in.nextInt();
        for(int i=1;i<=n;i++){
          a[i]=in.nextInt();
          dad[i]=-1;b[i]=0;son[i]=0;
        }
        while(m--!=0){
          int q=in.nextInt();
          if(q==1)
          a[in.nextInt()]=in.nextInt();
          else if(q==2)
          connect(in.nextInt(),in.nextInt());
          else{
            int x=in.nextInt();
            int y=in.nextInt();
            int v=in.nextInt();
            int dx=parent(x);
            int dy=parent(y);
            if(dx!=dy){
              st.append("0\n");
              continue;
            }
            if(b[dx]==1){
              st.append("0\n");
              continue;
            }
            long num=(long)((long)(v)*(long)(a[x]));
            long den=(long)(a[y]);
            long g=gcd(Math.abs(num),Math.abs(den));
            num/=g;den/=g;
            if(son[x]!=son[y])
            st.append("-");
            st.append(num+"/"+den+"\n");
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
