package com.example.dsvendas.service;

import com.example.dsvendas.Repositories.SaleRepository;
import com.example.dsvendas.Repositories.SellerRepository;
import com.example.dsvendas.dto.SaleDTO;
import com.example.dsvendas.dto.SaleSuccessDTO;
import com.example.dsvendas.dto.SalesSumDTO;
import com.example.dsvendas.entities.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly =true)
    public Page<SaleDTO> findAll(Pageable pageable){
        sellerRepository.findAll();
        Page<Sale> result =repository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly =true)
    public List<SalesSumDTO> amountGroupedBySeller(){
        return repository.amountGroupedBySeller();
    }

    @Transactional(readOnly =true)
    public List<SaleSuccessDTO> successGroupedBySeller(){
        return repository.successGroupedBySeller();
    }
}
