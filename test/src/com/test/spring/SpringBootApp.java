package com.test.spring;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpringBootApp {
    public static void main(String[] args) {
        List<Integer> ids=Stream.of(6,10,11).collect(Collectors.toList());

        ids.forEach(id->{
            System.out.println(id);
        });


    }
}
