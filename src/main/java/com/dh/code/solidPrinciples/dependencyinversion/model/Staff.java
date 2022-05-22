package com.dh.code.solidPrinciples.dependencyinversion.model;

public class Staff {

    public static int robEmployeeId = 101;
    public static int javiEmployeeId = 4;

    public static String robFirstName = "Rob";
    public static  String javiFirstName = "Javi";

    public static User rob() {
        return new User(robEmployeeId, robFirstName);
    }

    public static User javi() {
        return new User(javiEmployeeId, javiFirstName);
    }
}
