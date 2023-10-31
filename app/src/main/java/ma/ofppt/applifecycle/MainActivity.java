package ma.ofppt.applifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int i = 0;
    TextView txtNumber;
    Button btnAddOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("MyLifeCyle", "OnCreate");
        setContentView(R.layout.activity_main);
        txtNumber = findViewById(R.id.txtNumber);
        btnAddOne = findViewById(R.id.btnAddOne);
        if (savedInstanceState != null) {
            i = savedInstanceState.getInt("i");
            txtNumber.setText("" + i);
        }
        btnAddOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                txtNumber.setText("" + i);
            }
        });
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("i", i);
        outState.putFloat("x", 9);
        Log.i("MyLifeCyle", "onSaveInstanceState");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MyLifeCyle", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MyLifeCyle", "OnRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MyLifeCyle", "OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MyLifeCyle", "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MyLifeCyle", "onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MyLifeCyle", "onStop");
    }
}