package com.recursividadJava.alexanderTutoriales.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Categoria {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "CAT_ID", nullable = false, length = 11)
  private Integer id;
  @Column(name = "CAT_CODIGO")
  private String codigo;
  @Column(name = "CAT_DESCRIPCION")
  private String descripcion;
  @Column(name = "CAT_PADRE")
  private Integer catPadre;
  @Column(name = "CAT_ACTIVO")
  private char activo;
  @Transient
  List<Categoria> categorias;

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

  public Integer getCatPadre() {
    return catPadre;
  }

  public void setCatPadre(Integer catPadre) {
    this.catPadre = catPadre;
  }

  public char getActivo() {
    return activo;
  }

  public void setActivo(char activo) {
    this.activo = activo;
  }

  public List<Categoria> getCategorias() {
    return categorias;
  }

  public void setCategorias(List<Categoria> categorias) {
    this.categorias = categorias;
  }
}
