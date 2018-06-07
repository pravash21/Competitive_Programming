//https://www.codechef.com/MAY18A/problems/CHSIGN
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
          int a[]=new int[n+1];
          int c=0;
            for(int i=0;i<n;i++){
              a[i]=in.nextInt();
            }
            for(int i=0;i<n;i++){
              if(i==0){
                if(a[i]<a[i+1])
                a[i]=-a[i];
              }
              else if(i==n-1){
                if(a[i]<a[i-1])
                a[i]=-a[i];
              }
              else if(i>0&&i<n-1){
                if(a[i]<a[i-1]&&a[i]<a[i+1])
		              	a[i]=-a[i];
              }
            }
            ArrayList<Long> av=new ArrayList<>();
            ArrayList<Integer> pos=new ArrayList<>();
            int i=0;
            outer: while(i<n){
             if(i<n)
              if(a[i]<0)
		          {
		     	av.add((long)a[i]);
			    pos.add(i);
			    ++i;
	      	}
		else
		  {
			long sum=0;
			if(i<n)
			while(i<n&&a[i]>0)
			{
			  if(i<n)
				sum+=a[i];
				++i;
				
			}
			av.add(sum);
			pos.add(-1);
		}
		 
            }
            int sz=av.size();
            long dp[][]=new long[2][sz];
            if(av.get(0)<0)
	{
	dp[0][0]=av.get(0)*-1;
	dp[1][0]=av.get(0);
	}
	else
	dp[0][0]=dp[1][0]=av.get(0);
 if(sz>1){
	if(av.get(1)>0)
	{
	dp[0][1]=dp[0][0]+av.get(1); dp[1][1]=dp[1][0]+av.get(1);
	}
	else
	{
		dp[0][1]=Math.min(dp[0][0],dp[1][0])+av.get(1)*-1;
		dp[1][1]=Math.min(dp[0][0],dp[1][0])+av.get(1);
	}
 }
 int m[]=new int[sz];
 int v[]=new int[sz];
	Arrays.fill(m,1);
	Arrays.fill(v,1);
	for(i=2;i<=sz-1;i++)
	{
		if(av.get(i)>0)
		{
			dp[0][i]=dp[0][i-1]+av.get(i);
			dp[1][i]=dp[1][i-1]+av.get(i);
 
		}
		else
		{
			
			dp[0][i]=Math.min(dp[0][i-1],dp[1][i-1])+av.get(i)*-1;
 
			
			if(av.get(i-2)+av.get(i-1)+av.get(i)>0)
			dp[1][i]=Math.min(dp[0][i-1],dp[1][i-1])+av.get(i);
			else
			{
			v[i]=0;
			dp[1][i]=dp[0][i-1]+av.get(i);
			}
		}
 
	}
 
	int index=0;
	if(dp[1][sz-1]<dp[0][sz-1])
		index=1;
	else
		index=0;
 
	for(i=sz-1;i>=1;i--)
	{
		if(av.get(i)<0)
		{
			if(index==0)
			{
				m[i]=-1;
				if(dp[1][i-1]<dp[0][i-1])
				index=1;
				else
				index=0;
			}
			else
			{
				if(v[i]==0)
					index=0;
				else
				{
					if(dp[1][i-1]<dp[0][i-1])
						index=1;
					else
						index=0;
 
				}
 
			}
		}
 
	}
	if(av.get(0)<0)
	{
		if(index==0)
		m[0]=-1;
 
	}
 
	for(i=0;i<sz;i++)
	{
		if(m[i]==-1)
		a[pos.get(i)]*=-1;
	}
	for(int j=0;j<n;j++)
	st.append(a[j]+" ");
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
