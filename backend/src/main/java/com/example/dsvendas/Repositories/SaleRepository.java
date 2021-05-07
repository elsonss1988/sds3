package com.example.dsvendas.Repositories;

import com.example.dsvendas.dto.SaleSuccessDTO;
import com.example.dsvendas.dto.SalesSumDTO;
import com.example.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale,Long>{
    @Query("SELECT new com.example.dsvendas.dto.SalesSumDTO(obj.seller, SUM(obj.amount)) " + "FROM Sale AS obj GROUP BY obj.seller")
    List<SalesSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.example.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) " + "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupedBySeller();
}
