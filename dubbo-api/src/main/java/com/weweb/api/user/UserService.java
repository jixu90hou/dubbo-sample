package com.weweb.api.user;
import com.weweb.user.entity.User;
import java.util.List;

public interface UserService {
    List<User> findAllUsers();
}
