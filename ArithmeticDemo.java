public class ArithmeticDemo {
    public static void main(String[] args){
        int result = 76 + 3;
        System.out.println(result); // print 79

        result -= 3; //76
        System.out.println(result); // print 76

        result /= 3; 
        System.out.println(result); // print 25

        result += 1337; // 1362
        result %= 42; //18

        System.out.println(result); // print 18
        System.out.println(++result); // print 19 because ++result means result + 1 then print out the new result
        System.out.println(result++); //print 19 because result++ means print out result first then add 1. The current is 20
        System.out.println(result); //This will print 20
    }
}
