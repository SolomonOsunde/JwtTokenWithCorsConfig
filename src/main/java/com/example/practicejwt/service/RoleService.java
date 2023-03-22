package com.example.practicejwt.service;

import com.example.practicejwt.dao.RoleDao;
import com.example.practicejwt.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role){
        return roleDao.save(role);
    }

}
