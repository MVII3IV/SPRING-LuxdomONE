package com.luxdom.one.repositories;


import com.luxdom.one.models.Device;
import org.springframework.data.repository.CrudRepository;

public interface DeviceRepository extends CrudRepository<Device, Integer> {
    Device findById(Long id);
}
