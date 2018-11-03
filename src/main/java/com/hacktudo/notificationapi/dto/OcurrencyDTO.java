package com.hacktudo.notificationapi.dto;

import com.fasterxml.jackson.databind.JsonNode;
import com.hacktudo.notificationapi.model.Event;
import com.hacktudo.notificationapi.model.Person;
import com.vladmihalcea.hibernate.type.json.JsonNodeBinaryType;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
public class OcurrencyDTO {

    public Integer id;
    private Integer personId;
    private Integer eventId;
    private Double latitude;
    private Double longitude;
    private String status;
    public JsonNode data;
}
