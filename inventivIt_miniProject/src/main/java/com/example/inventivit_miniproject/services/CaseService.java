package com.example.inventivit_miniproject.services;

import com.example.inventivit_miniproject.entities.Case;
import com.example.inventivit_miniproject.repositories.CaseDao;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class CaseService implements Services<Case>{

    @Autowired
    private final CaseDao caseDao;

    @Override
    public Case get(Long id) {
        return caseDao.findById(id).get();
    }

    @Override
    public Case add(Case Case) {
        return caseDao.save(Case);
    }

    @Override
    public Case edit(Case Case) {
        return caseDao.save(Case);
    }

    @Override
    public boolean delete(Case Case) {
        try {
            caseDao.delete(Case);
            return true;
        }catch (DataAccessException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
