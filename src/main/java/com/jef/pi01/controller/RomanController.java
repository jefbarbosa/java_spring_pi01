package com.jef.pi01.controller;

import com.jef.pi01.model.RomanModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/convert-roman")
public class RomanController {

    RomanModel romanModel;

    public RomanController(@Autowired RomanModel romanModel) {
        this.romanModel = romanModel;
    }

    @GetMapping("/{numeral}")
    @ResponseBody
    public String convertToRoman(@PathVariable String numeral) {
        return "Result: " + romanModel.getConverter(numeral);
    }

}
