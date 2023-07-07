/*1. Պալինդրոմ թիվ:
Ստեղծեք ծրագիր, որը ստուգում է՝ արդյոք տրված ամբողջ թիվը պալինդրոմ է թե ոչ: 
Վերադարձնել true եթե պալինդրոմ է, false հակառակ դեպքում։ (Թիվը String չդարձնել)։ */

class Palindrome{
    public static void main(String[] args) {
        System.out.println(isPalindrome(7889));
        System.out.println(isPalindrome(252));
    }

    public static boolean isPalindrome(int number){
        if(number < 0 || number % 10 == 0){
            return false;
        }

        int halfReversed = 0;
        while(halfReversed < number){
            halfReversed = 10 * halfReversed + number % 10;
            number /= 10;
        }

        return halfReversed == number || halfReversed/10 == number;
    }
}