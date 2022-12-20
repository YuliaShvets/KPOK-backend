package ua.lviv.iot.KPOK.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.KPOK.model.Good;

@Repository
public interface KpokRepository extends JpaRepository<Good, Integer> {
}
