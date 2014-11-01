package com.springboot.repository

import com.springboot.domain.User
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

  List<User> findByFirstSurname(@Param("name") String name)
  List<User> findBySecondSurname(@Param("name") String name)
  List<User> findByName(@Param("name") String name)
  List<User> findByEmail(@Param("email") String email)

}