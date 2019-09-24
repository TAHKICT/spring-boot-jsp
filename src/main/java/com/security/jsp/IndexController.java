package com.security.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class IndexController {
    private String savedText = "Default text";

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("text", savedText);
        return "index";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void save(@ModelAttribute("text")String text, HttpServletResponse response) throws IOException {
        this.savedText = text;
        response.sendRedirect("/");
    }

}
