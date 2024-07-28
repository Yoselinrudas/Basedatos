package com.brixton.basedatos.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public class Audit {
    @Column(name = "createdat")
    private LocalDateTime createdAt;
    @Column(name = "createdby", length = 20)
    private String createdBy;
    @Column(name = "updatedat")
    private LocalDateTime updatedAt;
    @Column(name = "updatedby", length = 20)
    private String updatedBy;
    @Column(name = "registry_state")
    private byte registryState;
}
