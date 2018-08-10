#https://www.codechef.com/JUNE18A/problems/VSN
import math
for _ in range(int(input())):
  a,b,c,e,f,g,e1,f1,g1,x1,y1,z1,k=map(int,input().split())
  alp=a-x1
  bet=b-y1
  thet=c-z1
  c1=2*e*e1+2*f*f1+2*g*g1-2*a*e1-2*b*f1-2*c*g1
  c2=e1*e1+f1*f1+g1*g1
  c3=2*alp*e1+2*bet*f1+2*thet*g1
  p=e*e+f*f+g*g-2*a*e-2*b*f-2*c*g+a*a+b*b+c*c
  q=2*e*alp+2*f*bet+2*g*thet-2*a*alp-2*b*bet-2*c*thet
  r=alp*alp+bet*bet+thet*thet-k*k
  X=c3*c3-4*c2*r
  Y=2*q*c3-4*c1*r
  Z=q*q-4*p*r
  sq=float(math.sqrt(Y*Y-4*X*Z))
  if X!=0:
    ans1=float((-Y-sq)/(2*X))
    ans2=float((-Y+sq)/(2*X))
    if ans1<0 and ans2>=0:
      print('%.10f'%ans2)
    elif ans2<0 and ans1>=0:
      print('%.10f'%ans1)
    elif ans1>=0 and ans2>=0:
      print('%.10f'%(min(ans1,ans2)))
  else:
    print('%.10f'%(float(-Z/Y))) 
