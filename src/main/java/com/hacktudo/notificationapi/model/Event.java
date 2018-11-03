package com.hacktudo.notificationapi.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class Event {

    @Id
    public Integer id;
    public String name;
    public Boolean emergency;
    public String icon;
}
