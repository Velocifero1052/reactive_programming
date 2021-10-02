package com.reactive.programming.section01;

import com.reactive.programming.courseutil.Util;
import reactor.core.publisher.Mono;

public class MonoSubscribe {

    public static void main(String[] args) {
        Mono<Integer> mono = Mono.just("ball")
                                    .map(String::length)
                                    .map(l -> l);

        mono.subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete()
        );


    }
}
