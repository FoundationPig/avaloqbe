package com.assignment.avaloq.model;

import java.util.List;

public class BuzzFizzModel {
    private List<Integer> fizz;
    private List<Integer> buzz;
    private List<Integer> fizzbuzz;

    public BuzzFizzModel(List<Integer> fizz, List<Integer> buzz, List<Integer> fizzbuzz) {
        this.fizz = fizz;
        this.buzz = buzz;
        this.fizzbuzz = fizzbuzz;
    }

    public List<Integer> getFizz() {
        return fizz;
    }

    public void setFizz(List<Integer> fizz) {
        this.fizz = fizz;
    }

    public List<Integer> getBuzz() {
        return buzz;
    }

    public void setBuzz(List<Integer> buzz) {
        this.buzz = buzz;
    }

    public List<Integer> getFizzbuzz() {
        return fizzbuzz;
    }

    public void setFizzbuzz(List<Integer> fizzbuzz) {
        this.fizzbuzz = fizzbuzz;
    }
}
