package springbook.user.dao;

import springbook.user.domain.User;

import java.util.List;

/**
 * Created by ncrash on 2014. 2. 17..
 */
public interface UserDao {

    void add(User user);

    User get(String id);

    List<User> getAll();

    void deleteAll();

    int getCount();

    void update(User user);

}
