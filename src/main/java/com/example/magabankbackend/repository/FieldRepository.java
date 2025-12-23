package com.example.magabankbackend.repository;

import com.example.magabankbackend.entities.FieldEntity;
import com.example.magabankbackend.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FieldRepository extends JpaRepository<FieldEntity, String> {

    Optional<FieldEntity> getFieldEntityByBuildFieldEmailAndFieldName(UserEntity buildFieldEmail, String fieldName);
}
