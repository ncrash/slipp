package springbook.user.service;

import springbook.user.domain.User;

/**
 * Created by ncrash on 2014. 2. 18..
 */
public interface UserService {
    void add(User user);
    void upgradeLevels();
}

