//https://www.codechef.com/APRIL18B/problems/WGHTNUM
for _ in range(int(input())):
  n,w=map(int,input().split())
  k=0
  c=0
  for i in range(9,-1,-1):
    k=(i-w)
    if k>0 and k<=9:
      c+=1
  if c==0:
    print(0)
  else:
    p=pow(10,n-2,1000000007)
    ans=(p%1000000007*c%1000000007)%1000000007
    print(ans) 
