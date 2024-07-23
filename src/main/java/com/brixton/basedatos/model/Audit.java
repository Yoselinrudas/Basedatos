package com.brixton.basedatos.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@MappedSuperclass
public class Audit {
    @Column(name = "createdat")
    private LocalDate createdAt;
    @Column(name = "createdby", length = 20)
    private String createdBy;
    @Column(name = "updatedat")
    private LocalDate updatedAt;
    @Column(name = "updatedby", length = 20)
    private String updatedBy;
    @Column(name = "registry_state")
    private byte registryState;
}
