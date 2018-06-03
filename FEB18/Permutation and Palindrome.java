//https://www.codechef.com/FEB18/problems/PERMPAL
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
        int a[]=new int[26];
        for(int i=0;i<s.length();i++){
          a[(int)(s.charAt(i))-97]++;
        }
        int ev=0,od=0,y=0;
        char c='\0';
        for(int i=0;i<26;i++){
          if(a[i]%2==0)
          ev++;
          else{
          od++;c=(char)(i+97);
          }
        }
        if(s.length()%2==0&&ev==26)
        y=1;
        else if(s.length()%2!=0&&ev==25&&od==1)
        y=1;
        StringBuffer p=new StringBuffer();
        //StringBuffer r=new StringBuffer();
        //StringBuffer m=new StringBuffer();
        int b[]=new int[s.length()];
        if(y==0)
        st.append(-1);
        else{
          int f=-1,l=-1,r=s.length();
        for(int i=0;i<26;i++){
          f=-1;
          if(a[i]%2==0&&a[i]!=0){
          for(int j=0;j<a[i];j++){
            if(j%2==0){
              f=s.indexOf(((char)(i+97)),f+1);
              b[++l]=f+1;
            }
            else{
              f=s.indexOf(((char)(i+97)),f+1);
              b[--r]=f+1;
            }
          }
          }
        }
        f=-1;
        if(od==1){
          for(int i=0;i<a[(int)c-97];i++){
            f=s.indexOf(c,f+1);
            b[++l]=f+1;
          }
        }
        for(int i=0;i<s.length();i++){
          if(i==s.length()-1)
          p.append(b[i]);
          else
          p.append(b[i]+" ");
        }
        
        }
         st.append(p+"\n");
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
