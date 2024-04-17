package com.psps.jokesApp.Service.impl;

import com.psps.jokesApp.Service.JokesService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }


    @Override
    public String getRandomJokes() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
