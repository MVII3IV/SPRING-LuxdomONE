package com.luxdom.one.repositories;


import com.luxdom.one.models.State;
import org.springframework.data.repository.CrudRepository;

public interface StateRepository extends CrudRepository<State, Integer>{
    State findByDeviceId(int deviceId);
    Iterable<State> findByType(int type);
}
