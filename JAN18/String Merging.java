//https://www.codechef.com/JAN18/problems/STRMRG
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
    int m=in.nextInt();
    int n=in.nextInt();
    String a=in.next();
    String b=in.next();
    StringBuffer v=new StringBuffer("");
    v.append(a.charAt(0));
    for(int i=1;i<m;i++){
      if(a.charAt(i)==a.charAt(i-1))
      continue;
      else
      v.append(a.charAt(i));
    }
    a=v.toString();
    v=new StringBuffer("");
    v.append(b.charAt(0));
    for(int i=1;i<n;i++){
      if(b.charAt(i)==b.charAt(i-1))
      continue;
      else
      v.append(b.charAt(i));
    }
    b=v.toString();
     m=a.length();
    n=b.length();
    char X[]=a.toCharArray();
    char Y[]=b.toCharArray();
    //System.out.println(a+" "+b);
   int L[][] = new int[m+1][n+1];
	for (int i=0; i<=m; i++)
	{
	for (int j=0; j<=n; j++)
	{
		if (i == 0 || j == 0)
			L[i][j] = 0;
		else if (X[i-1] == Y[j-1])
			L[i][j] = L[i-1][j-1] +1;
		else
			L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
	}
	}
    int ans=L[m][n]+(m-L[m][n])+(n-L[m][n]);
    st.append(ans);
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
