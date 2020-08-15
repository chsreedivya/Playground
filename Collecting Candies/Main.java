#include<bits/stdc++.h>
using namespace std;

int main(){
    priority_queue<int,vector<int>,greater<int>>Candies;
    int i,t,n,c[100009], total=0;
    cin>>t;
    while(t>0){
        t--;
        total=0;
        cin>>n;
        for(i=0;i<n;i++){
            cin>>c[i];
            Candies.push(c[i]);
        }
        while(Candies.size()>1){
            int t1=Candies.top();
            Candies.pop();
            int t2=Candies.top();
            Candies.pop();
            total=total+t1+t2;
            Candies.push(t1+t2);
        }
        cout<<total<<endl;
    }
    return 0;
}
