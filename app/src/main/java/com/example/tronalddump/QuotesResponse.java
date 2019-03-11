package com.example.tronalddump;

import java.util.List;

public class QuotesResponse {
    private List<Quote2> quotes;

    public QuotesResponse(List<Quote2> quotes) {
        this.quotes = quotes;
    }

    public List<Quote2> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<Quote2> quotes) {
        this.quotes = quotes;
    }
}

