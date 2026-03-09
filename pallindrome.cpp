#include<iostream>
using namespace std;
class Solution {
public:
    bool isPalindrome(int x) {
        int temp, rev =0 , rem;
        temp = x;
        if(x<0){
           return false;
        }
        while(temp !=0 ){
            rem = x%10;
            rev = rev*10+rem;
            temp = temp/10;
        }
        if(rev == x){
            return true;
        }else{
            return false;
        }
    }  
};
int main(){
    Solution s;
    cout << s.isPalindrome(121) << endl;
    return 0;
}