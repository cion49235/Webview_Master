package com.just.agentweb.annie.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.widget.FrameLayout;

import com.just.agentweb.annie.R;
import com.just.agentweb.annie.common.FragmentKeyDown;
import com.just.agentweb.annie.fragment.AgentWebFragment;
import com.just.agentweb.annie.fragment.BounceWebFragment;
import com.just.agentweb.annie.fragment.CustomIndicatorFragment;
import com.just.agentweb.annie.fragment.CustomSettingsFragment;
import com.just.agentweb.annie.fragment.CustomWebViewFragment;
import com.just.agentweb.annie.fragment.JsAgentWebFragment;
import com.just.agentweb.annie.fragment.JsbridgeWebFragment;
import com.just.agentweb.annie.fragment.SmartRefreshWebFragment;
import com.just.agentweb.annie.fragment.VasSonicFragment;

/**
 * Created by cenxiaozhong on 2017/5/23.
 * source code  https://github.com/Justson/AgentWeb
 */

public class CommonActivity extends AppCompatActivity {


	private FrameLayout mFrameLayout;
	public static final String TYPE_KEY = "type_key";
	private FragmentManager mFragmentManager;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_common);

		mFrameLayout = (FrameLayout) this.findViewById(R.id.container_framelayout);
		int key = getIntent().getIntExtra(TYPE_KEY, -1);
		mFragmentManager = this.getSupportFragmentManager();
	}
	private AgentWebFragment mAgentWebFragment;
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		//一定要保证 mAentWebFragemnt 回调
//		mAgentWebFragment.onActivityResult(requestCode, resultCode, data);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {

		AgentWebFragment mAgentWebFragment = this.mAgentWebFragment;
		if (mAgentWebFragment != null) {
			FragmentKeyDown mFragmentKeyDown = mAgentWebFragment;
			if (mFragmentKeyDown.onFragmentKeyDown(keyCode, event)) {
				return true;
			} else {
				return super.onKeyDown(keyCode, event);
			}
		}

		return super.onKeyDown(keyCode, event);
	}




	@Override
	protected void onDestroy() {
		super.onDestroy();

	}
}
