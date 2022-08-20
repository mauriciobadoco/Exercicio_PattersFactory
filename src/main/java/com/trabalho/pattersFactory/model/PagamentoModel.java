package com.trabalho.pattersFactory.model;

import lombok.*;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "pagamento")
public class PagamentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoPagamento;

    @Column(length = 25 , nullable = false)
    private String status;

    @Column(length  = 20 , nullable = false)
    private BigDecimal valorPagar;

    @Column(length = 20 , nullable = false)
    private BigDecimal diferencaValor;

    @Column(length = 20 )
    private BigDecimal valorPago;
}
