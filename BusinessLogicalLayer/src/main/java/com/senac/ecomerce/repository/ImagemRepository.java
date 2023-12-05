package com.senac.ecomerce.repository;

import com.senac.ecomerce.model.Imagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImagemRepository extends JpaRepository<Imagem,Long> {
    
}
