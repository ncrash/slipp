package springbook.user.service;

import springbook.user.domain.User;

/**
 * Created by ncrash on 2014. 2. 17..
 */
public interface UserLevelUpgradePolicy {
    boolean canUpgradeLevel(User user);

    void upgradeLevel(User user);
}
