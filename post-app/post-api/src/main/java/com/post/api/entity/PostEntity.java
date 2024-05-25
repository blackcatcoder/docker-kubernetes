package com.post.api.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "post")
public class PostEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column
  private Long id;

  @Column private String name;
  @Column private String description;

  @Column private LocalDateTime publishDate;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDateTime getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(LocalDateTime publishDate) {
    this.publishDate = publishDate;
  }
}
