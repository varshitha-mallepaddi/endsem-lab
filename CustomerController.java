package com.klef.jfsd.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.model.Customer;
import com.klef.jfsd.service.CustomerService;

import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
    private CustomerService customerService;
	@GetMapping
    public void homePage(HttpServletResponse response) throws IOException {
        // Redirect to the static home page
        response.sendRedirect("/static/home.html");
    }

    @PostMapping("/update")
    public String updateCustomer(
            @RequestParam Long id,
            @RequestParam String name,
            @RequestParam String address) {
        customerService.updateCustomer(id, name, address);
        return "redirect:/static/success.html"; // Redirect to a success page
    }

}
