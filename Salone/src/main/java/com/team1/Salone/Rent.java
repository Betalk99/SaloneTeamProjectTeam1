package com.team1.Salone;

import com.team1.Salone.entieties.VehicleEntity;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class Rent {

    private OffsetDateTime startingDate;
    private OffsetDateTime endingDate;
    private BigDecimal dailyCost;
    private BigDecimal totalCost;
    private boolean paid;
    private VehicleEntity vehicle;
}
