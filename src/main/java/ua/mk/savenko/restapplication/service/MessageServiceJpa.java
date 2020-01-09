package ua.mk.savenko.restapplication.service;

import org.springframework.stereotype.Service;
import ua.mk.savenko.restapplication.domain.Message;
import ua.mk.savenko.restapplication.repo.MessageRepo;

import java.util.List;
import java.util.Optional;

@Service
public class MessageServiceJpa implements MessageService {
    private final MessageRepo messageRepo;

    public MessageServiceJpa(MessageRepo messageRepo) {
        this.messageRepo = messageRepo;
    }

    @Override
    public List<Message> getAll() {
        return messageRepo.findAll();
    }

    @Override
    public Optional<Message> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public Message save(Message message) {
        return messageRepo.save(message);
    }

    @Override
    public void delete(Message message) {
        messageRepo.delete(message);
    }
}
