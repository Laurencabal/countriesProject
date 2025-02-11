package org.lauren.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;
@Data
@AllArgsConstructor
public class EsmaltesEntities {
    private String id = UUID.randomUUID().toString();
    private String name;
    private String code;
    private String reference;
    private Integer Stock;
    private String Price;
}
