package com.cmcc.openfaas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author MicroBoy
 * @Desc
 * @date 2021/4/20 13:48
 **/
@RestController
public class Hello {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello world, " + new Date();
    }
}


/**
 * Revision history
 * -------------------------------------------------------------------------
 * * Date Author Note
 * -------------------------------------------------------------------------
 * 2021/4/20 MicroBoy create
 */
