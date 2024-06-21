package com.makifcevik.hrms.persistence.abstracts;

import com.makifcevik.hrms.core.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserDao extends JpaRepository<User, UUID>
{
}
