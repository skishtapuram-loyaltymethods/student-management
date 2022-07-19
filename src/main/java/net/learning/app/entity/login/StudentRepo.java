package net.learning.app.entity.login;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StuLogin,Long> {
}
