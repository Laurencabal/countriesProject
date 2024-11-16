package org.lauren.repositories;

import org.lauren.entities.BlushEntities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface BlushRepo extends JpaRepository<BlushEntities, UUID>{
}
