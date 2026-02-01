package Singelton;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception{
        Samosa s1 = Samosa.getSamosa();
        System.out.println(s1.hashCode());

        Samosa s2 = Samosa.getSamosa();
        System.out.println(s2.hashCode());

//        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Samosa s3 = constructor.newInstance();
//        System.out.println(s3.hashCode());

    }
}