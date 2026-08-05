class Solution {
    public int findNumbers(int[] nums) {
       int count=0;
        for(int num:nums){
            if(even(num))
            count++;
        }
       return count;
        
    }
     static boolean even(int num){
         int numberDigits=digits(num);
         if(numberDigits%2==0){
             return true;
         }
         return false;
     }
     static int digits(int num){
        if(num<0){
            num=num*-1;
        }
         return (int)(Math.log10(num))+1;
    
     }
    }
