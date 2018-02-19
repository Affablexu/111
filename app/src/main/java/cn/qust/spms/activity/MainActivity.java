package cn.qust.spms.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import cn.qust.spms.R;
import cn.qust.spms.dao.UserDAO;
import cn.qust.spms.entity.User;

@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    @ViewInject(R.id.button)
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        x.view().inject(this);
    }


    /**
     * 单击事件
     * type默认View.OnClickListener.class，故此处可以简化不写，@Event(R.id.bt_main)
     */
    @Event(type = View.OnClickListener.class,value = R.id.button)
    private void testInjectOnClick(View v){

//        关键技术跑通
//        User u = new User();
//        u.setId(1);
//        u.setName("admin");
//        u.setPassword("123");
//        new UserDAO().save(u);
//        User u1 = new User();
//        u1.setId(2);
//        u1.setName("admin1");
//        u1.setPassword("1234");
//        new UserDAO().save(u1);

        new UserDAO().deleteByPrimaryKey(3);

        List<User> users = new UserDAO().listAll();

        System.out.println(users);


    }
}
