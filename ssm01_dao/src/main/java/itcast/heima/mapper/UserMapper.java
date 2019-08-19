package itcast.heima.mapper;

import itcast.heima.domain.TabUser;
import itcast.heima.domain.User;

import java.util.List;

public interface UserMapper {

    List<User> findAll();
}
