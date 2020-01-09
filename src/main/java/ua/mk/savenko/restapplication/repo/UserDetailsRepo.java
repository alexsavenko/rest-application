package ua.mk.savenko.restapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.mk.savenko.restapplication.domain.User;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
