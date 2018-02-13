package cn.qust.spms.dao;

import org.xutils.DbManager;

/**
 * Created by FMY on 2017/6/26 0026.
 */
public class DBManager {
    private static DbManager.DaoConfig daoConfig;

    public static DbManager.DaoConfig getDaoConfig(){
        if(daoConfig==null){
            daoConfig = new DbManager.DaoConfig();
            daoConfig.setDbVersion(1);
        }
        return daoConfig;
    }
}
