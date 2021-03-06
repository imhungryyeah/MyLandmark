package com.example.mylandmark;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class infoActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView img_info;
    TextView txt_info;
    Button btn_info_back;
    int imgno = 0;
    int imgs[] = {R.drawable.111111, R.drawable.22222, R.drawable.33333, R.drawable.44444, R.drawable.55555};
    String txts[] = {"1번 설명","2번 설명","3번 설명","4번 설명","5번 설명"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        img_info = findViewById(R.id.img_info);
        txt_info = findViewById(R.id.txt_info);
        btn_info_back = findViewById((R.id.btn_info_back));

        img_info.setImageResource(imgs[imgno]);
        txt_info.setText(txts[imgno]);
        img_info.setOnClickListener(this);
        btn_info_back.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btn_info_back){
            finish();
        }else if(view.getId() == R.id.img_info){
            imgno = ++imgno %5;
            img_info.setImageResource(imgs[imgno]);
            txt_info.setText(txts(imgno));
        }
    }
}