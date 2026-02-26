package com.libraryjet.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BookRequestDto {
  String title;
  String author;
  Integer stockCount;
  Double price;
  LocalDate releaseDate;
  String ownerType;
}
