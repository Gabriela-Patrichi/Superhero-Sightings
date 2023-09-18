package com.SuperheroSightings.model;

import com.SuperheroSightings.dao.entity.SightingEntity;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@NoArgsConstructor //empty constructor
@AllArgsConstructor //a constructor using all attributes
@Getter //for getters
@Setter //for setters
@ToString //to use ToString method
@EqualsAndHashCode // equals and hash code

public class LocationDto {
    private int locationId;
    private String locationName;
    private String locationDescription;
    private String locationAddress;
    private BigDecimal latitude;
    private BigDecimal longitude;

    private List<SightingDto> allsightings;

}
