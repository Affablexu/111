package cn.qust.spms.dao;

import org.xutils.ex.DbException;
import org.xutils.x;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import cn.qust.spms.entity.User;

/**
 * Created by fmyha on 2018/2/13 0013.
 */

public abstract class BaseDAO<T> {
    protected Class<T> clazz;

    {
        Type genType = this.getClass().getGenericSuperclass();
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
        this.clazz = (Class<T>) params[0];
    }

    public void save(T t) {
        try {
            x.getDb(DBManager.getDaoConfig()).save(t);
        } catch (DbException e) {
            e.printStackTrace();
        }
    }

    public void deleteByPrimaryKey(Object primaryKey) {
        try {

            x.getDb(DBManager.getDaoConfig()).deleteById(clazz, primaryKey);
        } catch (DbException e) {
            e.printStackTrace();
        }
    }

    public T getFirst() {
        T t = null;
        try {
            t = x.getDb(DBManager.getDaoConfig()).findFirst(clazz);
        } catch (DbException e) {
            e.printStackTrace();
        }
        return t;
    }

    public T load(Object primaryKey) {
        T t = null;
        try {
            t = x.getDb(DBManager.getDaoConfig()).findById(clazz, primaryKey);
        } catch (DbException e) {
            e.printStackTrace();
        }
        return t;
    }

    public List<T> listAll() {
        try {
            return x.getDb(DBManager.getDaoConfig()).findAll(clazz);
        } catch (DbException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
