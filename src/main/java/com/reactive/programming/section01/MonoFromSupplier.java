package com.reactive.programming.section01;

import com.reactive.programming.courseutil.Util;
import reactor.core.publisher.Mono;

public class MonoFromSupplier {

    public static void main(String[] args) {
        //use only if you allready have data
        //Mono<String> mono = Mono.just(getName());

        Mono<String> mono = Mono.fromSupplier(MonoFromSupplier::getName);
        mono.subscribe(Util.onNext());

    }

    public static String getName(){
        System.out.println("Generating name...");
        return Util.faker().name().fullName();
    }


}
