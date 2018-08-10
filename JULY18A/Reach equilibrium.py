//https://www.codechef.com/JULY18A/problems/EQUILIBR/
a=int(input())
b=int(input())
k=pow(2,a-1,1000000007)
x=(k-a)%1000000007
ans=(x%1000000007*(pow(k,1000000007-2,1000000007))%1000000007)%1000000007
print(ans) 
