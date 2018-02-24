package cn.qust.spms.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.x;

import cn.qust.spms.R;

/**
 * Author:Nolle
 * Datetime:2/22/2018 11:32 AM
 * Description:主页面显示logo，实现快速开始，开始，设定按钮跳转，如果点击开始，实现姓名确认功能
 */
@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
    }

    @Event(type = View.OnClickListener.class, value = R.id.btn_setting)
    private void setting(View view) {
        Intent intent = new Intent();
        intent.setClassName("cn.qust.spms", "cn.qust.spms.activity.SettingActivity");
        startActivity(intent);
    }

    @Event(type = View.OnClickListener.class, value = R.id.btn_start)
    private void start(View view) {
        Intent intent = new Intent();
        intent.setClassName("cn.qust.spms", "cn.qust.spms.activity.StartActivity");
        startActivity(intent);
    }

    @Event(type = View.OnClickListener.class, value = R.id.btn_quick_start)
    private void quickstart(View view) {
        Intent intent = new Intent();
        intent.setClassName("cn.qust.spms", "cn.qust.spms.activity.QuickStartActivity");
        startActivity(intent);
    }
}
