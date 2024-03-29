package com.example.dogsteal;

import com.example.dogstealdummy.R;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class Splash extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_splash);
		
		Handler h=new Handler();
		h.postDelayed(new splashHandler(), 3000);

	}
	class splashHandler implements Runnable{

		@Override
		public void run() {
			startActivity(new Intent(getApplication(),MainActivity.class));
			Splash.this.finish();
		}
		
	}

}
