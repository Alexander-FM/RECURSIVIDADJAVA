package com.recursividadJava.alexanderTutoriales.mapper;

import com.recursividadJava.alexanderTutoriales.dto.CategoriaDTO;
import com.recursividadJava.alexanderTutoriales.model.Categoria;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoriaMapper {

  Categoria toEntity(CategoriaDTO categoriaDTO);

  CategoriaDTO toDTO(Categoria categoria);

  default List<CategoriaDTO> toDTOList(List<Categoria> categoriaList){
    if(categoriaList == null){
      return new ArrayList<>();
    }
    return categoriaList.stream().map(this::toDTO).collect(Collectors.toList());
  }

}
