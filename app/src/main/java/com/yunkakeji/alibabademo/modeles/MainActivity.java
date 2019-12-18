package com.yunkakeji.alibabademo.modeles;


import com.yunkakeji.alibabademo.R;
import com.yunkakeji.alibabademo.base.activity.BaseActivity;
import com.yunkakeji.alibabademo.databinding.ActivityMainBinding;
import androidx.databinding.DataBindingUtil;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends BaseActivity {

    private ActivityMainBinding mBD;

    @Override
    protected void initView() {
        mBD = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSupportActionBar(mBD.toolbar);
    }

    @Override
    protected void initData() {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
