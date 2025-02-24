package com.example.Dilya.RoomController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/room")
class RoomController {
    private final List<Room> rooms = new ArrayList<>();

    @GetMapping
    public String getRooms(Model model) {
        model.addAttribute("rooms", rooms);
        model.addAttribute("newRoom", new Room());
        return "index";
    }

    @PostMapping
    public String addRoom(@ModelAttribute Room room) {
        rooms.add(room);
        return "redirect:/room";
    }
}
