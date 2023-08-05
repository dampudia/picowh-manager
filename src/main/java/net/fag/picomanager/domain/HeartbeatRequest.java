package net.fag.picomanager.domain;

import lombok.Data;

@Data
public class HeartbeatRequest {
    
    private String name;
    
    private String ip;
}
