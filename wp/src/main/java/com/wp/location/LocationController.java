package com.wp.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
public class LocationController {
    @Autowired
    private LocationService locationService;

    @RequestMapping(value = "/locations")
    public String getAllLocations(Model model)
    {
        model.addAttribute("locations", locationService.getAllLocations());
        return "locations";
    }
    @RequestMapping(value = "/locations/{id}")
    public Optional<Location> getLocationById(@PathVariable String id){
        return locationService.getLocation(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/locations")
    public void addLocation(@RequestBody Location location){
        locationService.addLocation(location);
    }

    @RequestMapping(value = "/location/{id}", method = RequestMethod.DELETE)
    public void deleteLocation(@PathVariable String id) {
        locationService.deleteLocation(id);
    }

    @RequestMapping(value = "/locations/{id}", method = RequestMethod.PUT)
    public void updateLocation(@PathVariable String id, @RequestBody Location location) {

        locationService.updateLocation(id, location);

    }

    @RequestMapping(value = "/locations/name/{name}")
    public List<Location> getLocationByName(@PathVariable String name){
        return locationService.getLocationsByName(name);
    }
}
