package com.sky.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sky.ssm.model.User;
import com.sky.ssm.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
    private IUserService userService;

    @RequestMapping("/showUser")
    public String toIndex( Model model) {
        User user = this.userService.getUserById(1);
        model.addAttribute("user", user);
        return "User";
    }
}
