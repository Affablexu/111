package cn.qust.spms.dao;

import org.xutils.ex.DbException;
import org.xutils.x;

import java.util.List;

import cn.qust.spms.entity.User;

/**
 * Created by fmyha on 2018/2/13 0013.
 */

public class UserDao {
    public void save(User user) {
        try {
            x.getDb(DBManager.getDaoConfig()).save(user);
        } catch (DbException e) {
            e.printStackTrace();
        }
    }

    public void deleteAll(){
        try {
            x.getDb(DBManager.getDaoConfig()).delete(User.class);
        } catch (DbException e) {
            e.printStackTrace();
        }
    }

    public User getFirst() {
        User print = null;
        try {
            print = x.getDb(DBManager.getDaoConfig()).findFirst(User.class);
        } catch (DbException e) {
            e.printStackTrace();
        }
        return print;
    }

    public List<User> getAll() {
        try {
            return x.getDb(DBManager.getDaoConfig()).findAll(User.class);
        } catch (DbException e) {
            e.printStackTrace();
        }
        return null;
    }
}
