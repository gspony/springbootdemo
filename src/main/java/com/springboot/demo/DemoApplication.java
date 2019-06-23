package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Description 
 * @Author Maweijun 
 * @Date 2018/5/23  11:05
 * @Version 1.0
 */
@RestController
@SpringBootApplication
public class DemoApplication {

    @RequestMapping(value = "/initpage", method = RequestMethod.GET)
    public ModelAndView doView() {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
    @RequestMapping("/first")
    String first() {
        return "This is first";
    }
    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }

}
