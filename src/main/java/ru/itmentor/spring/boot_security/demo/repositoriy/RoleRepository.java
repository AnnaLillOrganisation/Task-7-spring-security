package ru.itmentor.spring.boot_security.demo.repositoriy;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itmentor.spring.boot_security.demo.model.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {

}