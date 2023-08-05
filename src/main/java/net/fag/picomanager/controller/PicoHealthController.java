package net.fag.picomanager.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import net.fag.picomanager.domain.Device;
import net.fag.picomanager.domain.HeartbeatRequest;
import net.fag.picomanager.repository.DeviceRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/pico-health")
public class PicoHealthController {
    
    private final DeviceRepository deviceRepository;

    @Transactional
    @RequestMapping(method = RequestMethod.POST, path = "/{id}")
    public void notify(@PathVariable(required = true, value = "id") int id, @RequestBody HeartbeatRequest req) {
        log.debug("received request {}", req);
        String name = req.getName();
        String ip = req.getIp();
        if (deviceRepository.existsById(id)) {
            Device device = deviceRepository.getReferenceById(id);
            device.setName(name);
            device.setIp(ip);
            deviceRepository.save(device);
        } else {
            Device device = new Device();
            device.setId(id);
            device.setName(name);
            device.setIp(ip);
            deviceRepository.save(device);
        }
        
    }
    
}
