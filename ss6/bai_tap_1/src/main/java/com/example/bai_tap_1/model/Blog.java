package com.example.bai_tap_1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "blogs")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "blog_id")
    private int id;

    @Column(name = "blog_name", columnDefinition = "VARCHAR(45)")
    private String name;

    @Column(name = "blog_topic", columnDefinition = "VARCHAR(45)", unique = true)
    private String topic;

    @Column(name = "link", columnDefinition = "VARCHAR(255)")
    private String link;

    @Column(name = "description", columnDefinition = "LONGTEXT")
    private String description;


}
