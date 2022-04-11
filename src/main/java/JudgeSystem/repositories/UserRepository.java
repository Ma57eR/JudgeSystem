package JudgeSystem.repositories;

import JudgeSystem.models.entities.User;
import JudgeSystem.models.services.UserServiceModel;
import JudgeSystem.services.UserService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {



}
