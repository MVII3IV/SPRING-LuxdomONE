package com.luxdom.one.controllers;


import com.luxdom.one.models.Device;
import com.luxdom.one.repositories.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("rest/api/device")
public class DeviceController {

    @Autowired
    DeviceRepository deviceRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Device> getAll(){
        return deviceRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Device getById(@PathVariable Long id){
        return deviceRepository.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void save(@RequestBody Device device) {
        deviceRepository.save(device);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id) {
        deviceRepository.delete(id);
    }

}
