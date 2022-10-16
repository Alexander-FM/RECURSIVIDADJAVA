package com.recursividadJava.alexanderTutoriales.controller;

import com.recursividadJava.alexanderTutoriales.dto.CategoriaDTO;
import com.recursividadJava.alexanderTutoriales.model.Categoria;
import com.recursividadJava.alexanderTutoriales.service.CategoryService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/categorias")
public class CategoriaController {

  private final CategoryService service;

  public CategoriaController(CategoryService service) {
    this.service = service;
  }

  @GetMapping("/listarCategorias")
  public ResponseEntity<List<CategoriaDTO>> listAll() {
    return ResponseEntity.ok(service.listarCategorias());
  }

  /*@GetMapping
  public List<Categoria> listAll() {
    return this.service.listarSinDTO();
  }*/
}
