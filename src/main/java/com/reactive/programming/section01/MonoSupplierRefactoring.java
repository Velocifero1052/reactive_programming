package com.reactive.programming.section01;

import com.reactive.programming.courseutil.Util;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

public class MonoSupplierRefactoring {

    public static void main(String[] args) {
        //not executing
        getName();
        //executing
        getName().subscribe(Util.onNext());
        //executing asynchronously
        getName().subscribeOn(Schedulers.boundedElastic()).subscribe(Util.onNext());
        //blocking main thread
        getName().subscribeOn(Schedulers.boundedElastic()).block();

        getName();

        Util.sleepSeconds(5);
    }

    public static Mono<String> getName(){
        System.out.println("entered get name method");
        return Mono.fromSupplier(() -> {
            System.out.println("Generating name...");
            Util.sleepSeconds(3);
            return Util.faker().name().firstName();
        }).map(String::toUpperCase);
    }



}
