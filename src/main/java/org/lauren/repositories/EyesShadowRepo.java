package org.lauren.repositories;

import org.lauren.entities.EyesShadowEntities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface EyesShadowRepo extends JpaRepository<EyesShadowEntities, UUID> {
}
