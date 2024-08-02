public class Sumofdigit {
    static int sumofdigit(int n){
        if(n>=0 && n<=9){
            return n;
        }
        return sumofdigit(n/10) + n%10 ;
        }
        public static void main (String []args){
            int n= 135;
            System.out.println(sumofdigit(n));
        }
    }

