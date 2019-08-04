package pl.luda.eventer;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;

@Controller
@RequestMapping("/events")

public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    String list(Model model) {
        model.addAttribute("events", eventService.listOfEvents());
        return "/list";
    }

    @GetMapping("/add")
    String addEvent() {
        return "/form";
    }

    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    String createEvent(@RequestParam String title,
                       @RequestParam @DateTimeFormat(iso=DateTimeFormat.ISO.DATE_TIME)LocalDateTime date,
                       @RequestParam String content) {

        eventService.created(title, date, content);


        return "redirect:/events";
    }


    }

