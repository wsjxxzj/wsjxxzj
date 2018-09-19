package com.service.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectuvcw {

        ProjectuvcwDelegate projectuvcwDelegate = new ProjectuvcwDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectuvcwDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}