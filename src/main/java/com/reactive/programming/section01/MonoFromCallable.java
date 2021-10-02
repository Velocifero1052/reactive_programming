package com.reactive.programming.section01;

import com.reactive.programming.courseutil.Util;
import reactor.core.publisher.Mono;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class MonoFromCallable {

    public static void main(String[] args) {

        Supplier<String> stringSupplier = () -> getName();
        Mono<String> monoFromSupplier = Mono.fromSupplier(stringSupplier);
        monoFromSupplier.subscribe(Util.onNext());


        Callable<String> stringCallable = () -> getName();
        Mono<String> monoFromCallable = Mono.fromCallable(stringCallable);
        monoFromCallable.subscribe(
                Util.onNext()
        );



    }

    public static String getName(){
        System.out.println("Generating name");
        return Util.faker().name().fullName();
    }


}
