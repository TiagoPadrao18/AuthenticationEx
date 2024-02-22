package com.authorizationEx.authorzationEx.repository;

import com.authorizationEx.authorzationEx.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User,Long> {


}
