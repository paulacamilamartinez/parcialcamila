package com.usta.parcial.Repository;

import com.usta.parcial.Entity.NombreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NombreRepositry extends JpaRepository<NombreEntity, Long>  {
}
