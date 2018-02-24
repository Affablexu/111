package cn.qust.spms.activity;/**
 * Created by Mlle Yh on 2/22/2018.
 */

import android.app.Activity;
import android.os.Bundle;

import org.xutils.view.annotation.ContentView;
import org.xutils.x;

import cn.qust.spms.R;

/**
 * Author:Nolle
 * Datetime:2/22/2018 5:40 PM
 * Description:器材使用者信息展示页面，从开始页面跳转
 */
@ContentView(R.layout.activity_main)
public class UserInfoActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
    }


}
