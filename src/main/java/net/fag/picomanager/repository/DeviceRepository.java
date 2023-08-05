package net.fag.picomanager.repository;

import net.fag.picomanager.domain.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Integer> {

}
