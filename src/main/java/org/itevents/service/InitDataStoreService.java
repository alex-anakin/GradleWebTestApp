package org.itevents.service;

import org.itevents.datastore.DataStore;
import org.itevents.datastore.MapDataStore;
import org.itevents.model.Event;
import org.itevents.model.Location;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;

@Service
public class InitDataStoreService {

    private final DataStore dataStore;

    public InitDataStoreService() {
        this.dataStore = new MapDataStore();
    }

    @PostConstruct
    public void init() {
        Event first = new Event(
                1, "IT-Forum for Juniors", new Location(50.4505F, 30.523F), new Date(1441123200000L));
        Event second = new Event(
                2, "Java-Party", new Location(49.833333F, 24F), new Date(1442152800000L));
        Event third = new Event(
                3, "Developers Happy NY", new Location(48.466601F, 35.018155F), new Date(1451091600000L));
        Event forth = new Event(
                4, "Java Mentors Day", new Location(50F, 36.229167F), new Date(1444086000000L));

        dataStore.addEvent(first);
        dataStore.addEvent(second);
        dataStore.addEvent(third);
        dataStore.addEvent(forth);
    }

    public DataStore getDataStore() {
        return dataStore;
    }
}
