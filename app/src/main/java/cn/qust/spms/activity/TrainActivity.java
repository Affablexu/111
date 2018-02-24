package cn.qust.spms.activity;

import android.app.Activity;
import android.os.Bundle;

import org.xutils.view.annotation.ContentView;
import org.xutils.x;

import cn.qust.spms.R;

/**
 * Author:Nolle
 * Datetime:2/22/2018 11:38 PM
 * Description:训练期间的动画效果，及训练进度查看，实现复用(快速和开始)
 */
@ContentView(R.layout.activity_train)
public class TrainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
    }
}
