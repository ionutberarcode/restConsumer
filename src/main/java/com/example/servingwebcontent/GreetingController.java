
package com.example.servingwebcontent;

import com.example.servingwebcontent.pojo.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @Autowired
    RestController controller;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name",
                controller.getBeer()
                        .stream()
                        .findFirst().map(Root::getName)
                        .orElse(""));
        return "greeting";
    }
}