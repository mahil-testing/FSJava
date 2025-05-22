public class MethodDemo {

    public static void main(String[] args) {
        MethodDemo d1 = new MethodDemo();
        d1.findSquare(10,20);
        d1.findSquare(19,3);
        int output2=d1.findSquare2(19,3);
        System.out.println(output2); //here we can print only if we return from the method otherwise not
    }

    //Scenario-1 Don't return anything from method
        public void findSquare(int n, int m){
            int squareOfTwoNumber= (n*n)+(m*m)+(2*n*m);
             System.out.println(squareOfTwoNumber);
        }
    //Scenario-2 Method which will return the output
    public int findSquare2(int n, int m) {
        int squareOfTwoNumber = (n * n) + (m * m) + (2 * n * m);
        return squareOfTwoNumber;
    }
}

