package org.codenaiten.notapp.infraestructure.persistence.repository;

import org.codenaiten.notapp.infraestructure.persistence.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserModel, String> {

    Optional<UserModel> findByUsername(String username);
    Optional<UserModel> findByEmail(String email);
}
