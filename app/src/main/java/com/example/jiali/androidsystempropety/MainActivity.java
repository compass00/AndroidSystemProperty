package com.example.jiali.androidsystempropety;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private GridView gview;
    private List<Map<String, Object>> data_list;
    private SimpleAdapter sim_adapter;
    // 图片封装为一个数组
    private String[] iconName = { "PRODUCT", "CPU_ABI", "TAGS", "VERSION_CODES", "MODEL", "SDK", "RELEASE",
            "DEVICE", "DEVICE", "DISPLAY", "BRAND", "BOARD" ,"FINGERPRINT", "ID", "MANUFACTURER", "USER"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        gview = (GridView) findViewById(R.id.gridView);
        //新建List
        data_list = new ArrayList<Map<String, Object>>();
        //获取数据
        getData();
        //新建适配器
        String [] from ={"name", "text"};
        int [] to = {R.id.texttitle, R.id.text};
        sim_adapter = new SimpleAdapter(this, data_list, R.layout.item, from, to);
        //配置适配器
        gview.setAdapter(sim_adapter);
    }



    public List<Map<String, Object>> getData(){
        //cion和iconName的长度是相同的，这里任选其一都可以
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "Product: ");
        map.put("text", android.os.Build.PRODUCT);
        data_list.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "CPU_ABI: ");
        map.put("text", android.os.Build.CPU_ABI);
        data_list.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "TAGS: ");
        map.put("text", android.os.Build.TAGS);
        data_list.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "VERSION_CODES: ");
        map.put("text", android.os.Build.VERSION_CODES.BASE);
        data_list.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "MODEL: ");
        map.put("text", android.os.Build.MODEL);
        data_list.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "SDK: ");
        map.put("text", android.os.Build.VERSION.SDK);
        data_list.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "VERSIONRELEASE: ");
        map.put("text", android.os.Build.VERSION.RELEASE);
        data_list.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "DEVICE: ");
        map.put("text", android.os.Build.DEVICE);
        data_list.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "DISPLAY: ");
        map.put("text", android.os.Build.DISPLAY);
        data_list.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "BRAND: ");
        map.put("text", android.os.Build.BRAND);
        data_list.add(map);


        map = new HashMap<String, Object>();
        map.put("name", "FINGERPRINT: ");
        map.put("text", android.os.Build.FINGERPRINT);
        data_list.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "ID: ");
        map.put("text", android.os.Build.ID);
        data_list.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "MANUFACTURER: ");
        map.put("text", android.os.Build.MANUFACTURER);
        data_list.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "USER: ");
        map.put("text", android.os.Build.USER);
        data_list.add(map);

        return data_list;
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
