public class HowToReadStackTrace {
//2-
    static void subroutine(){
        int d=0;
        int a=10/d;
    }

//3-

//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at HowToReadStackTrace.subroutine(HowToReadStackTrace.java:5)
//	at HowToReadStackTrace.main(HowToReadStackTrace.java:15)

//As we can see the bottom of the stack is main's line 23which is the call to subroutine() which caused exception
//at line 5. The call stack is very useful in debugging, because it pinpoints the precise sequence of steps that led to the error



    public static void main(String[] args) {
//1-
        // The stack trace will always show the sequence of method invocations that led up to the error
        // In this program, we see the same error as shown in TestClass1.java but in a method separate from main
        subroutine();

    }

}
