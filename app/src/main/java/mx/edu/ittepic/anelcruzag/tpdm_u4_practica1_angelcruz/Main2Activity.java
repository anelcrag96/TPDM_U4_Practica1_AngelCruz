package mx.edu.ittepic.anelcruzag.tpdm_u4_practica1_angelcruz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {
    int cantidad;
    Lienzo lienzo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle data=getIntent().getExtras();
        cantidad=data.getInt("Cantidad");
        lienzo=new Lienzo(this,cantidad);
        setContentView(lienzo);
    }
}
