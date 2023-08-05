package net.fag.picomanager.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Device {

    @Id
    private int id;

    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String ip;
    
}
