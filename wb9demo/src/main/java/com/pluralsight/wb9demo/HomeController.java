package com.pluralsight.wb9demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

 @RestController
public class HomeController {

     @RequestMapping(path="/", method = RequestMethod.GET)
     public String index(@RequestParam(defaultValue = "World") String name) {
         return "Hello " + name;
     }

     @RequestMapping(path="/goodbye", method = RequestMethod.GET)
     public String index(@RequestParam(defaultValue = "World") String name) {
         return "Goodbye " + name;
     }
 }
