package com.hacktudo.notificationapi.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class Person {

    @Id
    public Integer id;
    public String name;
    public String email;
    public Double rating;
}