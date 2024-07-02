package com.picpaysimplificado.entities.model;

import com.picpaysimplificado.enums.TypeAccount;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "account")
@EqualsAndHashCode(of = "id")
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "type")
    @Enumerated(value = EnumType.STRING)
    private TypeAccount type;

    @Column(name = "amount")
    private BigDecimal amount;


}
