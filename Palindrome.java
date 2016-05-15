/**
 * Created by owner on 3/13/2016.
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Is moon Palindrome "+ isPalindrome("moon"));
        System.out.println("is dad palindrome "+ isPalindrome("dad"));
        System.out.println("is noon palindrome "+ isPalindrome("noon"));
        System.out.println("is Accra palindrome "+isPalindrome("Accra"));
        System.out.println("is mom palindrome "+ isPalindrome("mom"));
        System.out.println("is level palindrome "+isPalindrome("level"));


    }
    public static boolean isPalindrome(String s){
        try {
        if(s.charAt(0)!= s.charAt(s.length()-1))
            return false;
        else
            return isPalindrome(s.substring(1,s.length()-1));


        }
        catch (StringIndexOutOfBoundsException e){
            return true;

        }

    }
}
