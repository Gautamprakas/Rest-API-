/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xadmin.SpringBootCrud.service;

import com.xadmin.SpringBootCrud.bean.Subject;
import com.xadmin.SpringBootCrud.repository.SubjectRepository;
import java.awt.print.Pageable;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 *
 * @author Prakash Gautam
 */
@Service
public class SubjectPaginationService implements ISubjectService {
    private SubjectRepository repository;

    @Override
    public List<Subject> findPaginated(int pageNo, int pageSize) {
       
    Pageable paging=PageRequest.of(pageNo,pageSize);
    Page<Subject> pageResult=repository.findAll(paging);
        return pageResult.toList();
    }
    
}
