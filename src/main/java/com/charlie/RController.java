package com.charlie;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/")
public class RController  {
    private static final Logger LOGGER = LoggerFactory.getLogger(RController.class);

    @Autowired
    private MyService service;

    public RController(MyService service2) {
        service = service2;
    }
    
    @GetMapping(path="add/{v1}/{v2}", produces="application/json")
    public Double add(@PathVariable("v1") Integer i1, @PathVariable("v2") Integer i2) {

        Double result = service.add(i1,i2);
        LOGGER.info(""+i1+" + "+i2+" = "+result.toString());
        return result;
    }
    @GetMapping(path="subtract/{v1}/{v2}", produces="application/json")
    public Double subtract(@PathVariable("v1") Integer i1, @PathVariable("v2") Integer i2) {

        Double result = service.subtract(i1,i2);
        LOGGER.info(""+i1+" - "+i2+" = "+result.toString());
        return result;
    }
    @GetMapping(path="multiply/{v1}/{v2}", produces="application/json")
    public Double multiply(@PathVariable("v1") Integer i1, @PathVariable("v2") Integer i2) {

        Double result = service.multiply(i1,i2);
        LOGGER.info(""+i1+" * "+i2+" = "+result.toString());
        return result;
    }
    @GetMapping(path="divide/{v1}/{v2}", produces="application/json")
    public Double divide(@PathVariable("v1") Integer i1, @PathVariable("v2") Integer i2) {

        Double result = service.divide(i1,i2);
        LOGGER.info(""+i1+" / "+i2+" = "+result.toString());
        return result;
    }


}