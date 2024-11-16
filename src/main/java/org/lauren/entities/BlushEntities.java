package org.lauren.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BlushEntities {
    @Id
    private String id = UUID.randomUUID().toString();
    private String name;
    private String code;
    private String reference;
    private Integer Stock;
    private String Price;
}
