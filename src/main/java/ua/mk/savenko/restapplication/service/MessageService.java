package ua.mk.savenko.restapplication.service;

import ua.mk.savenko.restapplication.domain.Message;

import java.util.List;
import java.util.Optional;

public interface MessageService {
    List<Message> getAll();

    Optional<Message> getById(Long id);

    Message save(Message message);

    void delete(Message message);
}
