package org.itevents.service;

import org.itevents.datastore.DataStore;
import org.itevents.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private InitDataStoreService initService;

    private DataStore dataStore;

    public EventServiceImpl() {
        this.dataStore = initService.getDataStore();
    }

    @Override
    public void addEvent(Event event) {
        dataStore.addEvent(event);
    }

    @Override
    public Event getEvent(Long id) {
        return dataStore.getEvent(id);
    }

    @Override
    public List<Event> getAllEvents() {
        return dataStore.getAllEvents();
    }

    @Override
    public Event removeEvent(Long id) {
        return dataStore.removeEvent(id);
    }
}
