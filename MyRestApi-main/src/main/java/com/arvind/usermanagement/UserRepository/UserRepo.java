package com.arvind.usermanagement.UserRepository;

import org.springframework.data.repository.CrudRepository;

import com.arvind.usermanagement.Model.User;

public interface UserRepo extends CrudRepository<User, Long>{

}
