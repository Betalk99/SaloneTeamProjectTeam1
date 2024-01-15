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
    private String marca;
    private String modello;
    private int cilindrata;
    private String colore;
    private int potenza;
    private String tipoCambio;
    private OffsetDateTime annoImmatricolazione;
    private String alimentazione;
    private BigDecimal prezzo;
    private int scontoPrezzo;
    private String accessori;
    private VehicleType vehicleType;
}
