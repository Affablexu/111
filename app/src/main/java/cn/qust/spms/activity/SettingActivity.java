package cn.qust.spms.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.x;

import cn.qust.spms.R;

/**
 * Author:Nolle
 * Datetime:2/22/2018 11:50 AM
 * Description:设定页面，在主页面点击设定按钮后跳转的页面
 */
@ContentView(R.layout.activity_setting)
public class SettingActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
        /*获取控件*/
    }

    @Event(type = View.OnClickListener.class, value = R.id.btn_setting_reflesh)
    private void reflesh(View view) {
        /*点击更新按钮实现的业务逻辑*/

    }

    @Event(type = View.OnClickListener.class, value = R.id.btn_setting_back)
    private void turnback(View view) {
        /*返回主页面*/
        Intent intent = new Intent();
        intent.setClassName("cn.qust.spms", "cn.qust.spms.activity.MainActivity");
        startActivity(intent);
    }

}

