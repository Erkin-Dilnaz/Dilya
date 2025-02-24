package com.example.Dilya.GuestController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/guest")
class GuestController {
    private final List<Guest> guests = new ArrayList<>();

    @GetMapping
    public String getGuests(Model model) {
        model.addAttribute("guests", guests);
        model.addAttribute("newGuest", new Guest());
        return "index";
    }

    @PostMapping
    public String addGuest(@ModelAttribute Guest guest) {
        guests.add(guest);
        return "redirect:/guest";
    }
}
