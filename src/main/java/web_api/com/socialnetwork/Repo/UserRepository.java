package web_api.com.socialnetwork.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
import web_api.com.socialnetwork.Entity.User;

import java.util.Optional;

@Transactional
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
 User findOneById(Long id);
 Optional<User> findByUsername(String username);
}
