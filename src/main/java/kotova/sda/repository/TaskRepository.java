package kotova.sda.repository;

import kotova.sda.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<User,Long> {
}
