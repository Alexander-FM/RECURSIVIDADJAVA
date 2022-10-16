package com.recursividadJava.alexanderTutoriales.dto;

import java.util.List;

public class CategoriaDTO {
  private Integer id;
  private String codigo;
  private String descripcion;
  private List<CategoriaDTO> categorias;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public List<CategoriaDTO> getCategorias() {
    return categorias;
  }

  public void setCategorias(List<CategoriaDTO> categorias) {
    this.categorias = categorias;
  }
}
