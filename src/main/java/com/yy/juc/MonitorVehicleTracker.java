package com.yy.juc;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author gongcy
 * @date 2023/1/2 5:55 下午
 * @Description
 */
public class MonitorVehicleTracker {

    private final Map<String,MutablePoint> locations;

    public MonitorVehicleTracker(Map<String, MutablePoint> locations) {
        this.locations = deepCopy(locations);
    }

    public synchronized Map<String, MutablePoint> getLocations() {
        return deepCopy(locations);
    }

    public synchronized MutablePoint getLocation(String id) {
        MutablePoint loc = locations.get(id);
        return loc == null ? null : new MutablePoint(loc);
    }

    public synchronized void setLocation(String id,int x,int y) {
        MutablePoint loc = locations.get(id);
        if (loc == null) {
            throw new IllegalArgumentException("No such ID");
        }
        loc.x = x;
        loc.y = y;
    }

    private static Map<String, MutablePoint> deepCopy(Map<String, MutablePoint> locations) {
        Map<String,MutablePoint> result = new HashMap<>();
        for (String id : locations.keySet()) {
            result.put(id,new MutablePoint(result.get(id)));
        }
        return Collections.unmodifiableMap(result);
    }
}
