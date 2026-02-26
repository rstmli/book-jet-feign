package com.libraryjet.dao;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
  @GeneratedValue
  Long id;
  String title;
  String author;
  Integer stockCount;
  Double price;
  LocalDate releaseDate;
}
