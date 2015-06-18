public class Calculator {
    
    public Calculator () {

    }
    
    public int addNumbers(int a, int b) {
        return a + b;
    }

    int multiplyNumbers(int a, int b) {
        return a*b;
    }

    int subsctractNumbers(int a, int b) {
        return a-b;
    }

    int divideNumbers(int a, int b) throws Exception{
        if (b == 0) {
            throw new Exception("Divide by 0 error");
        }
        return a/b;
    }
}