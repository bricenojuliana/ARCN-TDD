public class FizzBuzz {
    public static String fizzbuzz(int n) {
        String result = "";
        if(n % 3 == 0){
            result += "Fizz";
        }
        if (n % 5 == 0) {
            result += "Buzz";
        }
        if (result.equals("")) {
            return String.valueOf(n);
        } 
        return result;
    }
}