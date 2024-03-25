package ru.itmentor.spring.boot_security.demo.service;

import org.springframework.stereotype.Service;
import ru.itmentor.spring.boot_security.demo.model.Role;
import ru.itmentor.spring.boot_security.demo.repositoriy.RoleRepository;


import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    public RoleServiceImpl (RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Transactional
    @Override
    public void createRole(Role role) {
        roleRepository.save(role);
    }

    @Transactional(readOnly = true) //readOnly — определяет, является ли текущая транзакция доступной только для чтения или для записи.
    @Override
    public Role findRoleById(Long Id) {
        return roleRepository.getById(Id);
    }

    @Transactional
    @Override
    public Role updateRole(Role role) {
        return roleRepository.save(role);
    }

    @Transactional
    @Override
    public void deleteRoleById(Long Id) {
        roleRepository.deleteById(Id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Role> findAllRoles() {
        return roleRepository.findAll();
    }
}
