package GUI.LoginDemo.Dao;
import GUI.LoginDemo.Pojo.User;
public interface UserDao {
    public abstract boolean login(String Name, String Password);
    public abstract void regist(User user);
}
