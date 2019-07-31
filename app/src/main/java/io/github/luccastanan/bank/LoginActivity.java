package io.github.luccastanan.bank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private EditText edtUser;
    private TextView txvUser;
    private EditText edtPass;
    private TextView txvPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUser = findViewById(R.id.edt_user);
        txvUser = findViewById(R.id.txv_user);
        edtPass = findViewById(R.id.edt_pass);
        txvPass = findViewById(R.id.txv_pass);

        findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txvUser.setVisibility(edtUser.getText().length() == 0 ? View.VISIBLE : View.GONE);
                txvPass.setVisibility(edtPass.getText().length() == 0 ? View.VISIBLE : View.GONE);

                if (edtUser.getText().length() > 0 && edtPass.getText().length() > 0) {
                    //TODO: próxima tela
                }
            }
        });
    }
}
