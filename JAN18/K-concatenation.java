//https://www.codechef.com/JAN18/problems/KCON
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
    int n=in.nextInt();
    int k=in.nextInt();
    int a[]=new int[n*4];
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=in.nextInt();
      a[i]=arr[i];
    }
    int f=0;
    for(int j=0;j<n*3;j++){
      if(f==n)
      f=0;
      a[j+n]=arr[f];
      f+=1;
    }
    long max1=Integer.MIN_VALUE, max2=0;
		for (int i=0;i<n;i++)
		{
			max2=max2+a[i];
			if (max1<max2)
				max1= max2;
			if (max2< 0)
				max2= 0;
		}
    long maxf=Integer.MIN_VALUE, maxh=0;
    if(k>=2)
		for (int i=0;i<n*2;i++)
		{
			maxh=maxh+a[i];
			if (maxf<maxh)
				maxf= maxh;
			if (maxh< 0)
				maxh= 0;
		}
		long maxf1=Integer.MIN_VALUE, maxh1=0;
		if(k>=3)
		for (int i=0;i<n*3;i++)
		{
			maxh1=maxh1+a[i];
			if (maxf1<maxh1)
				maxf1= maxh1;
			if (maxh1< 0)
				maxh1= 0;
		}
		long max_fu=Integer.MIN_VALUE, max_hu=0;
		for (int i=0;i<n*4;i++)
		{
			max_hu=max_hu+a[i];
			if(max_fu<max_hu)
				max_fu= max_hu;
			if (max_hu< 0)
				max_hu= 0;
		}
		if(k==1)
		st.append(max1);
		else if(k==2)
		st.append(maxf);
		else if(k==3)
		st.append(maxf1);
		else{
		  if(max_fu-maxf1>0)
		  st.append(maxf1+(max_fu-maxf1)*(k-3));
		  else
		  st.append(maxf1);
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
