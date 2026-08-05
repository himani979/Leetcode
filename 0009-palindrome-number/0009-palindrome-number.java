class Solution {
    public boolean isPalindrome(int x) {
int original =x;
    int reverse=0;
     while(x>0){
       int num = x%10;
reverse = reverse*10+num;
     x=x/10;
     }
     if(original==reverse){
        return true;
     }
     else{
        return false;
     }
    }
}