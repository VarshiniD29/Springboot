package net.employee.springboot_backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")

public class Employee {

    @Id  //making id as primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name") //creating a column name for below field
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column (name = "email_id")
    private String emailId;

}
