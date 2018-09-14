package com.newsproutsmedia.sfgchucknorris.controllers;

import com.newsproutsmedia.sfgchucknorris.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokeService jokeService;

    // Inject instance of JokeService
    @Autowired
    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String getChuckJokes(Model model) {

        model.addAttribute("joke", jokeService.getRandomQuote());

        return "chucknorris";

    }

}
