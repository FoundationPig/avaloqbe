package com.assignment.avaloq.api;

import com.assignment.avaloq.model.BuzzFizzModel;
import com.assignment.avaloq.service.save.ServiceFacade;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/buzzfizz")
public class BuzzFizz {

    private ServiceFacade serviceFacade;

    @GetMapping
    public BuzzFizzModel getData(@RequestParam("data") Integer limit) {
        return createResponse(limit);
    }
    private BuzzFizzModel createResponse(Integer limit) {
        List<Integer> fizz = new ArrayList();
        List<Integer> buzz = new ArrayList();
        List<Integer> fizzbuzz = new ArrayList();
        for(int input = 1; input <= limit; input++) {
            if(input % 3 == 0 && input % 5 == 0) {
                fizzbuzz.add(input);
            } else if (input % 5 == 0) {
                buzz.add(input);
            } else if(input % 3 == 0) {
                fizz.add(input);
            }
        }

        Arrays.asList(2,3,4,5,6,7,8,8,9).stream().filter(item -> {
        return item / 2 ==0;}).collect(Collectors.toList());

        return new BuzzFizzModel(fizz, buzz, fizzbuzz);
    }

    @GetMapping("/testFunctionalInterface")
    public String response(){
        return serviceFacade.impl();
    }

}


