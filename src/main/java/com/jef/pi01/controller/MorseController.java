package com.jef.pi01.controller;

import com.jef.pi01.model.MorseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

@RestController
@RequestMapping("/morse")
public class MorseController {

    MorseService morseService;

    public MorseController(@Autowired MorseService morseService) {
        this.morseService = morseService;
    }

    @GetMapping("/translate-to-alpha")
    public String getAlphanumeric(@RequestParam String morseCode) {
        String[] words = morseCode.split("   ");
        String[] letters;
        StringBuilder phrase = new StringBuilder();

        for (String word: words) {
            letters = word.split(" ");
            for (String letter: letters) {
                phrase = new StringBuilder(phrase.toString().concat(MorseService.getMapping(letter)));
            }
            phrase.append(" ");
        }

        return phrase.toString();
    }
}
