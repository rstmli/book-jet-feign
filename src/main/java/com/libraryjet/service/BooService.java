package com.libraryjet.service;

import com.libraryjet.dao.BookRepository;
import com.libraryjet.dto.BookResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BooService {

  private final BookRepository bookRepository;


  public List<BookResponseDto> getAll() {
    var e = bookRepository.findAll();
    List<BookResponseDto> dtos = new ArrayList<>();
    for (var es : e) {
      dtos.add(new BookResponseDto(es.getId(), es.getTitle(), es.getAuthor(), es.getStockCount(), es.getPrice(), es.getReleaseDate()));
    }
    return dtos;
  }

  public List<BookResponseDto> getByAuthor(String author) {
    var e = bookRepository.findByAuthor(author);
    List<BookResponseDto> dtos = new ArrayList<>();
    for (var es : e) {
      dtos.add(new BookResponseDto(es.getId(), es.getTitle(), es.getAuthor(), es.getStockCount(), es.getPrice(), es.getReleaseDate()));
    }
    return dtos;

  }


}
