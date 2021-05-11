package com.assignment.avaloq.api;

import com.assignment.avaloq.model.BuzzFizzModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuzzFizzTest {

    BuzzFizz buzzFizz = new BuzzFizz();

    @Test
    public void testMethod() {
        BuzzFizzModel buzzFizzModel = buzzFizz.getData(4);
        assertTrue(buzzFizzModel.getBuzz().isEmpty());
    }

}