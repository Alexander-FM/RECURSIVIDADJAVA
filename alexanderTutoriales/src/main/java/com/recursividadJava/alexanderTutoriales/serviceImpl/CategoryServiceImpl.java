package com.recursividadJava.alexanderTutoriales.serviceImpl;

import com.recursividadJava.alexanderTutoriales.dto.CategoriaDTO;
import com.recursividadJava.alexanderTutoriales.mapper.CategoriaMapper;
import com.recursividadJava.alexanderTutoriales.model.Categoria;
import com.recursividadJava.alexanderTutoriales.repository.CategoriaRepository;
import com.recursividadJava.alexanderTutoriales.service.CategoryService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
  private final CategoriaMapper mapper;
  private final CategoriaRepository repository;

  public CategoryServiceImpl(CategoriaMapper mapper, CategoriaRepository repository) {
    this.mapper = mapper;
    this.repository = repository;
  }

  /**
   * Traemos los registros padres, y a partir de ello comenzamos a iterar
   * enviandole el id para encontrar subRegistros que su id padre sea igual id que
   * se envia como parámetro.
   * @return
   */
  @Override
  public List<CategoriaDTO> listarCategorias() {
    List<Categoria> listaCategoria = obtenerListaJerarquica(repository.findCategoriaIsNull());
    return mapper.toDTOList(listaCategoria);
  }

  @Override
  public List<Categoria> listarSinDTO() {
    List<Categoria> listaCategoria = obtenerListaJerarquica(repository.findCategoriaIsNull());
    return listaCategoria;
  }

  public List<Categoria> obtenerListaJerarquica(List<Categoria> lista) {
    for(Categoria c: lista){
      c.setId(c.getId());
      c.setCodigo(c.getCodigo());
      c.setDescripcion(c.getDescripcion());
      c.setCategorias(repository.findCategoria(c.getId()));
      obtenerListaJerarquica(c.getCategorias());
    }
    return lista;
  }
}
