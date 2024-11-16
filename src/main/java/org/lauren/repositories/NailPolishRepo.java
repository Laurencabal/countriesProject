package org.lauren.repositories;

import org.lauren.entities.NailPolishEntities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface NailPolishRepo extends JpaRepository<NailPolishEntities, UUID>{
}
