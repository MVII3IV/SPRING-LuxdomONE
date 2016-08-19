package com.luxdom.one.controllers;


import com.luxdom.one.models.State;
import com.luxdom.one.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;

@RestController
@RequestMapping("/rest/api/state")
public class StateController {

    @Autowired
    StateRepository stateRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<State> findAll(){
        return stateRepository.findAll();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public State findByDeviceId(@PathVariable int id){
        return stateRepository.findByDeviceId(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void saveState(@RequestBody State state){
        stateRepository.save(state);
    }
}
