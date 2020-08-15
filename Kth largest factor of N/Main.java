#include <iostream>
using namespace std;
int main() 
{
	unsigned int n,k,i,count=0;
	cin>>n>>k;
	if(k==1)
		cout<<n;
	else
	{
		k--;
		for(i=n/2;i>=1;i--)
		{
  			if((n%i)==0)
  			count++;
  			if(count==k)
  			{
  				cout<<i;
  				break;
  			}
		}
		if(count!=k)
 			cout<<"1";
 	}
	return 0;
}