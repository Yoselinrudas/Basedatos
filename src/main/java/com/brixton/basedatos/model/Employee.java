package com.brixton.basedatos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "EMPLOYEE")
@Getter
@Setter
public class Employee extends Audit{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 50)
    private String employeeName;

    @Column(name="employee_lastname", length = 50)
    private String employeeLastname;

    @ManyToOne
    @JoinColumn(name = "area_id", foreignKey = @ForeignKey(name = "fk_employee_area_id"))
    private Area area;

    @Column(length = 50)
    private String address;

    @Column(length = 15)
    private String phone;

    @Column(length = 30)
    private String email;

    @OneToMany(mappedBy = "employee")
    private Set<EmployeexPerfil> employeexPerfil = new HashSet<>();
}
