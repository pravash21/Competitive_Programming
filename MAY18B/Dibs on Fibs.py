//https://www.codechef.com/MAY18A/problems/DBFB
mod=10**9+7
MAX = 100000
f = [0] * MAX
def fib(n) :
    if (n == 0 or n==-1) :
        return 0
    if (n == 1 or n == 2) :
        f[n] = 1
        return (f[n])
    if (f[n]) :
        return f[n]
 
    if( n & 1) :
        k = (n + 1) // 2
    else : 
        k = n // 2
    if((n & 1) ) :
        f[n] = (fib(k) * fib(k) + fib(k-1) * fib(k-1))
    else :
        f[n] = (2*fib(k-1) + fib(k))*fib(k)
 
    return f[n]
 
for _ in range(int(input())):
  m,n=map(int,input().split())
  a=list(map(int,input().split()))
  b=list(map(int,input().split()))
  suma=sum(a)
  sumb=sum(b)
  ans=0
  sum1=0
  x=fib(n-1)
  y=fib(n-2)
  sum1=(sum1%mod+(x*sumb)%mod)%mod
  z=sum1
  sum1+=(a[0]*y*m)%mod
  if n==1:
    ans=0
    ans=(ans%mod+(suma*m)%mod)%mod
    print(ans)
  elif n==2:
    ans=0
    ans=(sumb%mod*m%mod)%mod
    print(ans)
  else:
    ans=0
    ans=(ans%mod+(z*(m-1))%mod+((suma-a[0])*y*m)%mod)%mod
    ans=(ans%mod+sum1%mod)%mod
    print(ans) 
