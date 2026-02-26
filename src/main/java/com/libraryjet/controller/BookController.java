package com.libraryjet.controller;

import com.libraryjet.dto.BookResponseDto;
import com.libraryjet.service.BooService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
@RequestMapping("v1/book-jet")
public class BookController {
  private final BooService booService;

  @GetMapping("/get")
  public List<BookResponseDto> getAll(){
    return booService.getAll();
  }
  @GetMapping("/get/{author}")
  public List<BookResponseDto> getAuthor(@PathVariable String author){
    return booService.getByAuthor(author);
  }
}
