/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.xadmin.SpringBootCrud.service;

import com.xadmin.SpringBootCrud.bean.Subject;
import java.util.List;

/**
 *
 * @author Prakash Gautam
 */
public interface ISubjectService {
    List<Subject>findPaginated(int pageNo,int pageSize);
    
}
