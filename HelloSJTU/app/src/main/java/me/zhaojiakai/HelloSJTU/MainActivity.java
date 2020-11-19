package me.zhaojiakai.HelloSJTU;

import android.app.Activity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn1OnClick(View v) {
        Log.println(Log.INFO, "MainActivity", "用户点击了btn1");
        String id = "TextView1";
        TextView helloTextView = findViewById(R.id.textView1);
        String text = (String) helloTextView.getText();
        Log.d("TextView1","旧内容" + text);
        helloTextView.setText("Hello SJTUer!");

    }
}



