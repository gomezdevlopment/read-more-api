package com.gomezdevlopment.readmore.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String title;
    private String author;
    private String description;
    private String startDate;
    private String finishDate;
    private String status;
    private int rating;
    private String image;
    private String userID;
}
