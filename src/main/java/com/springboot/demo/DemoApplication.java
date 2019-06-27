package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

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
    @RequestMapping("/rest")
    @ResponseBody
    public Map<String, Object> rest() {

        Map<String, Object> data = new HashMap<String, Object>();

        data.put("1", "A");
        data.put("2", 2);

        return data;

    }

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }

}
