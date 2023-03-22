package com.example.practicejwt.dao;

import com.example.practicejwt.entity.UserData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<UserData,String> {

}
