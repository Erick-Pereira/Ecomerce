package com.senac.ecomerce.repository;

import com.senac.ecomerce.model.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    @Query("select new com.senac.ecomerce.model.ProdutoViewModel(p.Nome) from Produto p")
    public List<ProdutoViewModel> findProductViewModel();
}
