package com.recursividadJava.alexanderTutoriales.repository;

import com.recursividadJava.alexanderTutoriales.model.Categoria;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Transactional
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
  @Query("SELECT c FROM Categoria c Where c.catPadre = :id")
  List<Categoria> findCategoria(@Param("id") Integer id);

  @Query("SELECT c FROM Categoria c Where c.catPadre IS NULL")
  List<Categoria> findCategoriaIsNull();
}
