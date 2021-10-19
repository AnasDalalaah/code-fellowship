package com.example.codefellowship.codefellowship.repos;

import com.example.codefellowship.codefellowship.models.ApplicationUser;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationUserRepository extends CrudRepository<ApplicationUser,Integer> {
    public ApplicationUser findByUsername(String username);
}
