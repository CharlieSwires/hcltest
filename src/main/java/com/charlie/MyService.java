package com.charlie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;


@Service
@ComponentScan(basePackages = {"com.charlie"})
public class MyService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyService.class);

    public Double add(Integer i1, Integer i2) {
        return (double)(i1+i2);
    }
    public Double subtract(Integer i1, Integer i2) {
        return (double)(i1-i2);
    }
    public Double multiply(Integer i1, Integer i2) {
        return ((double)i1*(double)i2);
    }
    public Double divide(Integer i1, Integer i2) {
        return ((double)i1/(double)i2);
    }
}
