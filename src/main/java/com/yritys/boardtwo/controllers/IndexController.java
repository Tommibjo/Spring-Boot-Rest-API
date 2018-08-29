/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yritys.boardtwo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Tommi
 */
@Controller
public class IndexController {

    @RequestMapping("/") // tämän voi tehdä -> @GetMapping
    public String home() {
        return "index";
    }
}
