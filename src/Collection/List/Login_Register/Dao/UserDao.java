package Collection.List.Login_Register.Dao;

import Collection.List.Login_Register.pojo.User;

/**
 *
 */
public interface UserDao {
    /**
     *
     * @param username
     * @param password
     * @return
     */
    public abstract boolean isLogin(String username, String password);

    /**
     *
     * @param user
     */
    public abstract void register(User user);
}
