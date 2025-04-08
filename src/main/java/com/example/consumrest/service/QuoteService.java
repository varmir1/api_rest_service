package com.example.consumrest.service;

import com.example.consumrest.model.Quote;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteService {

    private final String API_URL = "https://api.kanye.rest/";
    private final RestTemplate restTemplate;

    public QuoteService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Quote getQuote() {
        return restTemplate.getForObject(API_URL, Quote.class);
    }
} 