package org.lauren.repositories;

import org.lauren.entities.LipsTickEntities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface LipsTickRepo extends JpaRepository<LipsTickEntities, UUID> {
}
