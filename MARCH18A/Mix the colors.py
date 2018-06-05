//https://www.codechef.com/MARCH18A/problems/MIXCOLOR
for _ in range(int(input())):
  n=int(input())
  a=list(map(int,input().split()))
  s=set(a)
  print(n-len(s)) 
