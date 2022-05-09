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
    @Column(name="caseId")
    private Long id;

    private LocalDateTime creationDate;

    private LocalDateTime lastUpdateDate;

    private String title;

    private String description;


}
