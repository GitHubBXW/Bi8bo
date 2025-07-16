package com.example.demo.demos.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping("/product")
public class ProductController {


    @RequestMapping("/test")
    public void test(@RequestParam("id") String id){

    }
}
