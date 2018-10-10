package com.just.agentweb.annie.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.just.agentweb.AgentWebConfig;
import com.just.agentweb.annie.R;
import com.just.agentweb.annie.common.GuideItemEntity;

import static com.just.agentweb.annie.sonic.SonicJavaScriptInterface.PARAM_CLICK_TIME;

public class MainActivity extends AppCompatActivity {
	@RequiresApi(api = Build.VERSION_CODES.KITKAT)
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		startActivity(new Intent(this, WebActivity.class));
		finish();


	}
}



