package pl.luda.eventer;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class EventService {

    private EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    List<Event> listOfEvents(){
        return eventRepository.findAll();
    }


    boolean created(String name, LocalDateTime date, String content){
        Event event = new Event(name, date, content);
        Event created = eventRepository.save(event);
        return created.getId() != null;
    }
}
