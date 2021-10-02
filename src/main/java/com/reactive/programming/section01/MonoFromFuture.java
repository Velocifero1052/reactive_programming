package com.reactive.programming.section01;

import com.reactive.programming.courseutil.Util;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;

public class MonoFromFuture {

    public static void main(String[] args) {
        Mono.fromFuture(getName()).subscribe(Util.onNext());
        Util.sleepSeconds(2);
    }

    private static CompletableFuture<String> getName(){
        return CompletableFuture.supplyAsync(() -> Util.faker().name().fullName());
    }



}
