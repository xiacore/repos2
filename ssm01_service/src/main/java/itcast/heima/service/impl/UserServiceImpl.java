package itcast.heima.service.impl;

import itcast.heima.domain.TabUser;
import itcast.heima.domain.User;
import itcast.heima.mapper.TabUserMapper;
import itcast.heima.mapper.UserMapper;
import itcast.heima.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private TabUserMapper tab_userMapper;
    @Resource
    private UserMapper userMapper;

    @Override
    public List<TabUser> findAll1() {
        return tab_userMapper.findAll1();
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
