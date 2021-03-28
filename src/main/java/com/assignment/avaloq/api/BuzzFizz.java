package com.assignment.avaloq.api;

import com.assignment.avaloq.model.BuzzFizzModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/buzzfizz")
public class BuzzFizz {

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
        return new BuzzFizzModel(fizz, buzz, fizzbuzz);
    }

}


