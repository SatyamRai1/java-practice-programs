public class TestClass1 {
    public static void main(String[] args) {
        int d=0;
        int a=42/d;




// In case we haven't supplied a default exception handler in our code, The exception thrown is caught by
// default handler provided by the java runtime system. In fact any exception that is not caught by your
// program will ultimately be processed by the default handler. The default handler displays a string
// describing the exception, prints a stack trace from the point at which the exception occurred, terminates
// the program.


// If you run the above code,

// Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at TestClass1.main(TestClass1.java:4)

// Notice how class name: TestClass1 ; method name: main ; file name: TestClass1.java ; and line number:4
// are all included in the simple stack trace


    }
}

