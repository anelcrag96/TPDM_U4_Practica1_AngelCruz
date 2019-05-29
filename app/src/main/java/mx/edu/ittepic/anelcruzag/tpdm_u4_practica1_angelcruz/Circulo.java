package mx.edu.ittepic.anelcruzag.tpdm_u4_practica1_angelcruz;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import java.util.Random;

public class Circulo {
    int x, y;
    int rad;
    int r, g, b;
    int movX, movY;

    public Circulo(int x, int y, int radio) {
        this.x = x;
        this.y = y;
        this.rad = radio;
        Random random=new Random();

        movX=(random.nextInt(25)-20);
        movY=(random.nextInt(50)- 20);
        r = (int) (Math.random() * 254);
        g = (int) (Math.random() * 254);
        b = (int) (Math.random() * 254);
    }//constructor


    public  void movimiento(){
        x += movX;
        y += movY;
    }//movimiento

    public void pintar(Canvas c, Paint p){
        p.setColor(Color.rgb(r,g,b));
        c.drawCircle(x, y, rad, p);
    }//pintar
}//class
