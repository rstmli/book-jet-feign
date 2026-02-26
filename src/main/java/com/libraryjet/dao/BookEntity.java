package com.libraryjet.dao;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Table(name = "book_jet_entity")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  String title;
  String author;
  Integer stockCount;
  Double price;
  LocalDate releaseDate;
  String ownerType;

  public BookEntity(String title, String author, Integer stockCount, Double price, LocalDate releaseDate, String ownerType) {
    this.title = title;
    this.author = author;
    this.stockCount = stockCount;
    this.price = price;
    this.releaseDate = releaseDate;
    this.ownerType = ownerType;
  }
}
