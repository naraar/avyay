package com.avyay.repo;

import org.springframework.data.repository.CrudRepository;

import com.avyay.entity.User;


public interface UserRepo extends CrudRepository<User, Long>
{
}
