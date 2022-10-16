package com.recursividadJava.alexanderTutoriales.service;

import com.recursividadJava.alexanderTutoriales.dto.CategoriaDTO;
import com.recursividadJava.alexanderTutoriales.model.Categoria;
import java.util.List;

public interface CategoryService {
  List<CategoriaDTO> listarCategorias();
  List<Categoria> listarSinDTO();
}
