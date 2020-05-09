package frank.Service;

import frank.mapper.UserMapper;
import frank.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public int insert(User user) {
        return userMapper.insert(user);
    }

    public User query(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
