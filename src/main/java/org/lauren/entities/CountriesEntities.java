package org.lauren.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;
@Data
@AllArgsConstructor
public class CountriesEntities {
    private String id = UUID.randomUUID().toString();
    private String name;
    private String code;
    private String description;
}
