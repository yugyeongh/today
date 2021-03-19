#include <iostream>
#include <stack>

using namespace std;

int main() {
    int n,sum=0,a;
    cin >> n;
    
    stack <int> stack;
    for (int i=0;i<n;i++){
        cin >> a;
        if (a==0){
            int t = stack.top();
            sum -= t;
            stack.pop();
        } else {
            stack.push(a);
            sum+=a;
        }
    }
    cout << sum << '\n';
    return 0;
}
