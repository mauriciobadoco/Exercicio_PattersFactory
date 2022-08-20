package com.trabalho.pattersFactory.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "recebimento")
public class RecebimentosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoRecebimento;

    @Column(length = 25 , nullable = false)
    private String tipoRecebimento;

    @Column(length  = 20 , nullable = false)
    private BigDecimal valorReceber;

    @Column(length = 20 )
    private BigDecimal valorRecebido;
}
