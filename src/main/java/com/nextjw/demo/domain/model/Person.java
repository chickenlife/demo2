package com.nextjw.demo.domain.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Person")
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;

    @Version
    Long version;

    LocalDateTime dateCreated;
    LocalDateTime dateUpdated;

    @PrePersist
    public void created() {
        this.dateCreated = LocalDateTime.now();
        this.dateUpdated = LocalDateTime.now();
    }

    @PreUpdate
    public void onUpdate() {
        this.dateUpdated = LocalDateTime.now();
    }
}
