package com.aynodkar.guesstheword.guesstheword.controllers;

import com.aynodkar.guesstheword.guesstheword.service.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GameController {

    GameService gameService;
    @GetMapping("/game-home")
    public String showGameHomePage(Model model){
        String randomWord = gameService.toString();
        model.addAttribute("wordToDisplay",randomWord);
        return "game-home-page";
    }
}
