package Collection.List.Login_Register.impl;
import Collection.List.Login_Register.Dao.UserDao;
import Collection.List.Login_Register.pojo.User;

import java.util.ArrayList;

/**
 * 这是用户操作的具体实现类
 */
public class UserDaoImpl implements UserDao {
    //为了让多个方法能够使用同一个集合，就把集合定义为成员变量
    //为了不让外人看见，就用private
    //为了让多个对象共享一个变量，用静态
    private static ArrayList<User> arrayList = new ArrayList<User>();
    @Override
    public boolean isLogin(String username, String password) {
        //遍历集合，获取每个用户的信息密码是否匹配
        boolean flag = false;
        for (User u : arrayList){
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    @Override
    public void register(User user) {
        //把用户信息存入集合

        arrayList.add(user);
    }
}
