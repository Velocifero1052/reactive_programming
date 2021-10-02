package com.reactive.programming.section01;

import java.util.stream.Stream;

public class LectureOneStream {

    public static void main(String[] args) {
        Stream<Integer> stream  = Stream.of(1).map(i -> {
            try{
                Thread.sleep(1000);
            }catch (InterruptedException exception){
                exception.printStackTrace();
            }
            return i * 2;
        });

        //System.out.println(stream);
        stream.forEach(System.out::println);

    }

}
