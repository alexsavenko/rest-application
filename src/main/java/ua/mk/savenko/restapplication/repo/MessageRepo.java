package ua.mk.savenko.restapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.mk.savenko.restapplication.domain.Message;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
