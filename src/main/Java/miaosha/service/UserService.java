package miaosha.service;

import miaosha.dao.UserDao;
import miaosha.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Tony on 2018/4/10.
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User getUserById(int id){
        User user = userDao.getUserById(id);
        return user;
    }
}
