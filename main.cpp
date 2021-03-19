#include <iostream>
#include <stack>

using namespace std;

int main() {
    stack <int> s;
    int n,a;
    cin >> n;
    
    string cmd;
    for (int i=0;i<n;i++){
        cin >> cmd;
        
        if (cmd=="push"){
            cin >> a;
            s.push(a);
        } else if (cmd=="pop"){
            if (s.empty()) cout << -1 << '\n';
            else {
                cout << s.top() << "\n";
                s.pop();
            }
        } else if (cmd=="size"){
            cout << s.size() << '\n';
        } else if (cmd=="empty"){
            if (s.empty()) cout << 1 <<'\n';
            else cout << 0 << '\n';
        } else if (cmd=="top"){
            if (s.empty()) cout << -1 << '\n';
            else cout << s.top() << '\n';
        }
    }
    return 0;
}
