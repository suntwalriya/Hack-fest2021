#include<iostream>
#include<vector>
using namespace std;

int main() {
	int t, n;
	cin>>t;
	while(t--) {
		cin>>n;
		vector<int> v(n);
		int max = v[0];
		for(int i=0; i<n; i++) {
			cin>>v[i];
		}

        int maxSum = v[0], index=0, curr_max = v[0];
		for(int i=1; i<2*n; i++) {
            if(i==index)
                break;
			if(v[i%n]+curr_max>0 && v[i%n]+curr_max>v[i%n]) {
                curr_max += v[i];
            } else {
                index=i;
                curr_max+=0;
            }
            if(curr_max>max)
                max = curr_max;
        }
		cout<<max<<endl;
	}
	return 0;
}