package com.wp.location;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LocationRepository extends CrudRepository<Location, String> {

    public List<Location> findByName (String name);
}
