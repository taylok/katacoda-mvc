package com.example.service;

// Spring Controller makes model available to the application
// It mediates between our views and internal model / business logic

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

// Spring auto wires these up to the Servlet container for us
// If request comes in to Servlet as /fruits it is routed to this Spring Controller
@Controller
@RequestMapping("/fruits")
public class FruitController {

    // A simple list cache to store fruits
    private List<Fruit> fruits = new ArrayList<>();

    // Servlet provides us with Spring Model, which is available in our view
    @GetMapping
    public String home( Model model) {
        model.addAttribute("fruits", fruits);     // For the List view
        model.addAttribute("fruitForm", new Fruit()); // For the Form
        return "home";
    }

    // handle input from the Add Fruit form
    @PostMapping
    public String createFruit(@ModelAttribute Fruit fruit) {
        fruits.add(fruit);
        return "redirect:/fruits";
    }
}
