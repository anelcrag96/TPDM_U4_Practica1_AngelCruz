package mx.edu.ittepic.anelcruzag.tpdm_u4_practica1_angelcruz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText cantidad;
    Button generar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cantidad=findViewById(R.id.txtNumeroCirculos);
        generar=findViewById(R.id.btnGenerar);
        generar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("Cantidad",Integer.parseInt(cantidad.getText().toString()));
                startActivity(i);
            }
        });
    }
}
