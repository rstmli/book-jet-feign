package com.libraryjet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookResponseDto {
  Long id;
  String title;
  String author;
  Integer stockCount;
  Double price;
  LocalDate releaseDate;
}
