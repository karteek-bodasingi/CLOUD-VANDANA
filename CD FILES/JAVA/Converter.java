import java.util.HashMap;
import java.util.Scanner;
public class convter {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print(" Enter a Roman value: ");
        String roman = s.next();
        String romanNumeral= roman.toUpperCase();
        int result = romanToInteger(romanNumeral);
        System.out.println("Integer representation of " + romanNumeral + " is: " + result);
    }
    public static int romanToInteger(String s) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        int result =romanValues.get(s.charAt(s.length()-1)) ;
        for (int i = s.length()-2; i >= 0; i--) {
            if (romanValues.get(s.charAt(i))<romanValues.get(s.charAt(i+1))) 
            {
                result -=romanValues.get(s.charAt(i));
            } else {
                result +=romanValues.get(s.charAt(i));
            }
        }
        return result;
    }
}