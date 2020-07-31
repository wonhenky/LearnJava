package GUI.LoginDemo.Dao;

import GUI.LoginDemo.Pojo.User;

import java.io.*;

public class UserDaoImpl implements UserDao {
    private static File file = new File("User.tex");
    //类加载的时候把文件创建
    static {
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean login(String Name, String Password) {
        boolean flag = false;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] datas = line.split("=");
                if (datas[0].equals(Name) && datas[1].equals(Password)) {
                    flag = true;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return flag;
    }

    @Override
    public void regist(User user) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(file));
            bw.write(user.getName() + "=" + user.getPassword());
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
