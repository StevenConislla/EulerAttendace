package com.plug.eulerattendance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SalidaActivity extends AppCompatActivity {

    @BindView(R.id.txtResult)
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salida);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnScanEntra, R.id.btnMenuPrincipal})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnScanEntra:


                break;
            case R.id.btnMenuPrincipal:
                Intent intent=new Intent(SalidaActivity.this,MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}
