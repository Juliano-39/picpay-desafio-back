package com.picpaysimplificado.entities.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity(name = "transaction")
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private Account senderId;

    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private Account receiverId;

    @Column(name = "value")
    private Float value;
}
