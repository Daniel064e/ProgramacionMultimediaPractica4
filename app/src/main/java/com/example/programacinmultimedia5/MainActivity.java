package com.example.programacinmultimedia5;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText tCorreo;

    private EditText tContraseña;

    private Button bContinuar;

    private Switch sRecordar;

    private TextView tvMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tCorreo = findViewById(R.id.etCorreo);
        tContraseña = findViewById(R.id.etContraseña);
        bContinuar = findViewById(R.id.bContinuar);
        sRecordar = findViewById(R.id.sRecordar);
        tvMensaje = findViewById(R.id.tvMensaje);

        bContinuar.setOnClickListener(v -> {
            String correo = tCorreo.getText().toString();
            String contraseña = tContraseña.getText().toString();

            boolean recordar = sRecordar.isChecked();

            if (correo.equals("correo@correo.com") && contraseña.equals("123")) {
                tvMensaje.setText("Usuario y contraseña correctos");
                tCorreo.setText("");
                tContraseña.setText("");
                tvMensaje.setTextColor(Color.GREEN);

                if (recordar) {
                    tCorreo.setText("correo@correo.com");
                    tContraseña.setText("");
                    tvMensaje.setText("Almacenados para siguinte accesos");
                }

            } else {
                tvMensaje.setText("Usuario y/o contraseña incorrectos");
                tvMensaje.setTextColor(Color.RED);
            }
        });
    }
}