package com.example.Dilya.BookingController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/booking")
class BookingController {
    private final List<Booking> bookings = new ArrayList<>();

    @GetMapping
    public String getBookings(Model model) {
        model.addAttribute("bookings", bookings);
        model.addAttribute("newBooking", new Booking());
        return "index";
    }

    @PostMapping
    public String addBooking(@ModelAttribute Booking booking) {
        bookings.add(booking);
        return "redirect:/booking";
    }
}
