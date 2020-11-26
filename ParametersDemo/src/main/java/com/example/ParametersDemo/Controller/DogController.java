/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ParametersDemo.Controller;

import com.example.ParametersDemo.Model.Dog;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Harish Thadka
 */
@Controller
public class DogController {
    
//    @RequestMapping("display")
//    public String display(HttpServletRequest request){
//        HttpSession session = request.getSession();
//        String dogNameIn = request.getParameter("dogName");
//        session.setAttribute("dogNameDisplay", dogNameIn);
//        return "display.html";
//    }
    
//    @RequestMapping("display")
//    public String display(@RequestParam("hiddenName") String dogName, HttpSession session){
//        session.setAttribute("dogNameDisplay", dogName);
//        return "display.html";
//    }
    
//    @RequestMapping("display")
//    public ModelAndView display(String dogName){
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("display.html");
//        mv.addObject("dogNameDisplay", dogName);
//        return mv;
//    }
    
     @RequestMapping("display")
    public ModelAndView display(Dog d){
        ModelAndView mv = new ModelAndView("display.html");
        mv.addObject("dogNameDisplay", d);
        return mv;
    }   
 
}
