package com.team1.Salone.entieties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleEntity {
    private String brand;
    private String model;
    private int displacement;
    private String colour;
    private int hp;
    private String gearType;
    private OffsetDateTime modelYear;
    private String fuel;
    private BigDecimal price;
    private int priceDiscount;
    private String accessories;
    private VehicleType vehicleType;
}
