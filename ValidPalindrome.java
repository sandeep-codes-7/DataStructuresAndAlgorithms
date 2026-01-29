class ValidPalindrome{

//leetcode #problem:9 valid palindrome

    public static Boolean isValid(int number){
        int rem,rev=0,temp=number;
        while(number>0){
            rem = number%10;
            rev = rev * 10 + rem;
            number = number/10;
        }
        // System.out.println(number);
        if(rev == temp)return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isValid(121));
    }
}

