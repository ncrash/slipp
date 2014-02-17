package springbook.user.service;

import static springbook.user.domain.Level.MIN_LOGCOUNT_FOR_SILVER;
import static springbook.user.domain.Level.MIN_RECCOMEND_FOR_GOLD;

import springbook.user.dao.UserDao;
import springbook.user.domain.Level;
import springbook.user.domain.User;

/**
 * Created by ncrash on 2014. 2. 17..
 */
public class DefaultUserLevelUpgradePolicy implements UserLevelUpgradePolicy {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public boolean canUpgradeLevel(User user) {
        Level currentLevel = user.getLevel();
        switch(currentLevel) {
            case BASIC: return (user.getLogin() >= MIN_LOGCOUNT_FOR_SILVER);
            case SILVER: return (user.getRecommend() >= MIN_RECCOMEND_FOR_GOLD);
            case GOLD: return false;
            default: throw new IllegalArgumentException("Unknown Level: " + currentLevel);
        }
    }

    public void upgradeLevel(User user) {
        user.upgradeLevel();
        userDao.update(user);
    }
}