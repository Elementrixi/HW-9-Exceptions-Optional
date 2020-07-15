package main.java.com.alpashaev.rethrowing;

public class RethrowingException {
    public static void someMethod(){
        try {
            someMethod2();
        }catch (Exception e){
            e.printStackTrace(System.out);
        }
        {
            System.out.println("\nCaught exception from someMethod");
        }
    }
    public static void someMethod2() throws Exception {
        try {
            throw new Exception("\nException from someMethod2");
        } catch (Exception e){
            e.printStackTrace(System.out);
            {
                System.out.println("\nCaught exception from someMethod2");
                    throw e;
            }
        }
    }
}
