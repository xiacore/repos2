package itcast.heima.service;

import itcast.heima.domain.TabUser;
import itcast.heima.domain.User;

import java.util.List;

public interface UserService {
    List<TabUser> findAll1();

    List<User> findAll();
}
