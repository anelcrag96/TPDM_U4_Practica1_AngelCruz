package mx.edu.ittepic.anelcruzag.tpdm_u4_practica1_angelcruz;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

import java.util.Random;

import static java.lang.Thread.sleep;

public class Lienzo extends View {
    Thread hilo;

    Circulo[] circulos;

    public Lienzo(Context context){

        super(context);
        final int cantidad = (int) (Math.random() * 50) + 5;
        circulos = new Circulo[cantidad];
        Random random=new Random();

        for (int i = 0; i < cantidad; i++) {
            int x,y,rad;
            rad = random.nextInt(100) + 50;
            x = random.nextInt(200) + rad;
            y = random.nextInt(200) + rad;
            circulos[i] = new Circulo(x,y,rad);
        }//for

        hilo = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    for (int i = 0; i < cantidad; i ++) {
                        circulos[i].movimiento();
                    }//for
                    try {
                        sleep(20);
                    }//try
                    catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }//catch
                    invalidate();
                }//while
            }
        });
        hilo.start();
    }//constructor

    public void limites(Circulo circle, Canvas c){
        if((circle.x + circle.rad ) >= c.getWidth()){
            circle.movX *= -1;
        }//if
        if((circle.x  - circle.rad) < 1){
            circle.movX *= -1;
        }//if
        if((circle.y + circle.rad  )>= c.getHeight()){
            circle.movY *= -1;
        }//if
        if((circle.y - circle.rad ) < 1){
            circle.movY *= -1;
        }//if
    }//limites

    protected void onDraw(Canvas canvas){
        Paint p = new Paint();
        for (Circulo bolita : circulos) {
            limites(bolita, canvas);
            bolita.pintar(canvas, p);
        }//for
    }//onDraw

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        invalidate();
        return true;
    }//onTouchEvent
}//class
