package anotation;

import java.lang.annotation.*;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomiClass = Class.forName("anotation.Xiaomi");
        Annotation annotationXiaomi = xiaomiClass.getAnnotation(Smartphone.class);
        Smartphone sm1 = (Smartphone) annotationXiaomi;
        System.out.println(sm1.OS());
        System.out.println(sm1.yearOfCompanyCreation());
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Smartphone {
    String OS() default "android";

    int yearOfCompanyCreation() default 2011;
}

@Smartphone(OS = "android", yearOfCompanyCreation = 2010)
class Xiaomi {
    String model;
    double price;
}

@Smartphone(OS = "ios", yearOfCompanyCreation = 1976)
class Iphone {
    String model;
    double price;
}