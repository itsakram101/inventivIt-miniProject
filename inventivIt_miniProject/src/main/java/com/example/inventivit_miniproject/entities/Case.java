package com.example.inventivit_miniproject.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "case")
@Getter @Setter @NoArgsConstructor @ToString
public class Case {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="caseId", nullable = false)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime creationDate;

    @Column(nullable = false)
    private LocalDateTime lastUpdateDate;

    @Column(nullable = false, length = 255)
    private String title;

    @Column(nullable = false, length = 2056)
    private String description;


}
