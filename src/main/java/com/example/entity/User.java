package com.example.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="my_user")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;

    @Column(name="email_id")
    private String emailId;

}
