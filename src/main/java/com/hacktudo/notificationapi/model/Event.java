package com.hacktudo.notificationapi.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
public class Event {

    public Integer id;
    public String name;
    public Boolean emergency;
    public String icon;
}
