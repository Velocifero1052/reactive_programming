package com.reactive.programming.section01;

import com.reactive.programming.courseutil.Util;

public class MonoSupplierRefactoring {




    public static String getName(){
        System.out.println("Generating name");
        return Util.faker().name().fullName();
    }



}
