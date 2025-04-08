package com.example.consumrest.controller;

import com.example.consumrest.model.Quote;
import com.example.consumrest.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuoteController {

    @Autowired
    private QuoteService quoteService;

    @GetMapping("/")
    public String getQuote(Model model) {
        Quote quote = quoteService.getQuote();
        model.addAttribute("quote", quote);
        return "index";
    }
} 