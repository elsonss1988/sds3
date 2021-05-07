package com.example.dsvendas.service;

import com.example.dsvendas.Repositories.SellerRepository;
import com.example.dsvendas.dto.SellerDTO;
import com.example.dsvendas.entities.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {
    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll(){
      List<Seller> result = repository.findAll();
      return result.stream().map(x-> new SellerDTO(x)).collect(Collectors.toList());
    }

}
