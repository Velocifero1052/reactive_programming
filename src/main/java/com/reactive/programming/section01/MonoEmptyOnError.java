package com.reactive.programming.section01;

import com.reactive.programming.courseutil.Util;
import reactor.core.publisher.Mono;

public class MonoEmptyOnError {

    public static void main(String[] args) {
        userRepository(1).subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete()
        );
    }


    private static Mono<String> userRepository(int userId){
        if(userId == 1){
            return Mono.just(Util.faker().name().firstName());
        }else if(userId == 2){
            return Mono.empty();
        }else{
            return Mono.error(new RuntimeException("Not in the allowed range"));
        }
    }

}
