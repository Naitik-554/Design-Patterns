package Singelton;

public class Samosa {

    private static Samosa samosa;

    private Samosa() {
        if(samosa != null) {
            throw new RuntimeException("You are breaking down the Singelton Pattern");
        }
    }

    /*
        Singelton Pattern can be broken down using Reflection API
        handling can be done by handling it in Constructor
    */
    public static Samosa getSamosa() {
        if(samosa == null) {
            synchronized (Samosa.class) {
                if(samosa == null) {
                    samosa = new Samosa();
                }
            }
        }
        return samosa;
    }

}