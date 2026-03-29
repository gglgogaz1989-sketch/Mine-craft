package com.craft3d.android;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends Activity {
    private GLSurfaceView glView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        glView = new GLSurfaceView(this);
        glView.setEGLContextClientVersion(3);
        // Рендер из core/ будет добавлен позже
        // glView.setRenderer(new GameRenderer(this));
        
        setContentView(glView);
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        glView.onResume();
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        glView.onPause();
    }
}
