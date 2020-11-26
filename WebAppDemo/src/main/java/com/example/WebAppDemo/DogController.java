/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.WebAppDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Harish Thadka
 */
@Controller
public class DogController {

    @RequestMapping("dogHome")
    public String dogHome() {
        return "dogHome.html";
    }

    public String index() {
        return "index.html";
    }

    @RequestMapping("dogFood")
    public String dogFood() {
        return "dogFood.html";
    }

    @RequestMapping("dogPlay")
    public String dogPlay() {
        return "dogPlay.html";
    }

    @RequestMapping("dogSchool")
    public String dogSchool() {
        return "dogSchool.html";
    }

}
