//Question is Find LCM of any two number's?

class LCM {
    //Greatest Common Divisor
    // static int gcd (int a, int b){
    //     if (b == 0) {
    //         return a;
    //     }
    //     return gcd(b,a%b);    
    // }
    
     static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b;  
        return gcd(b % a, a);  
    } 
    
    //Code for LCM
    static int LCM (int a, int b){
        return a*b/gcd(a,b);
    }
    
    public static void main(String[] args) {
        int a=20, b=60;
        System.out.println("LCM of " +a+ " and " +b+ " is: " +LCM(a,b));
    }
}