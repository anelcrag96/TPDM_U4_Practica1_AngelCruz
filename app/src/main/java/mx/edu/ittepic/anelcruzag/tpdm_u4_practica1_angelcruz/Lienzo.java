package mx.edu.ittepic.anelcruzag.tpdm_u4_practica1_angelcruz;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Lienzo extends View {
    int cantidad, ancho, alto;
    Circulo circulos[];
    int colores[];
    Thread hilo;

    public Lienzo(Context context, int cantidad){
        super(context);
        this.cantidad=cantidad;
        circulos=new Circulo[cantidad];
        colores=new int[]{Color.BLUE,Color.RED,Color.GRAY,Color.GREEN,Color.YELLOW,Color.CYAN,Color.MAGENTA,Color.LTGRAY};
        for (int i=0;i<circulos.length;i++){
            circulos[i]=new Circulo();
            circulos[i].setRadio((int)(Math.random()*200)+1);
            circulos[i].setDireccion((int)(Math.random()*8)+1);
            circulos[i].setColor(colores[(int)(Math.random()*colores.length)]);
            //new Thread(circulos[i]).start();
        }//for
    }//Lienzo

    public void cambiarX(Circulo c){
        if (c.isTipoX()){
            int dir=(int)(Math.random()*5)+1;
            c.incrementaX(dir);
        }
        else{
            int dir=(int)(Math.random()*5)+1;
            c.decrementaY(dir);
        }
    }
    public void cambiarY(Circulo c){
        if (c.isTipoX()){
            int dir=(int)(Math.random()*5)+1;
            c.incrementaY(dir);
        }
        else{
            int dir=(int)(Math.random()*5)+1;
            c.decrementaY(dir);
        }
    }
    public void onDraw(Canvas c){
        alto=c.getHeight();
        ancho=c.getWidth();
        for (int i=0;i<circulos.length;i++){
            Paint p=new Paint();
            if (circulos[i].isPrimera()){
                circulos[i].setX((int)(Math.random()*ancho)+circulos[i].getRadio());
                circulos[i].setY((int)(Math.random()*alto)+circulos[i].getRadio());

                if (circulos[i].getX()<=0){
                    circulos[i].setX(circulos[i].getX()+circulos[i].getRadio()*2);
                }
                else if(circulos[i].getX()>=ancho){
                    circulos[i].setX(circulos[i].getX()-circulos[i].getRadio()*2);
                }
                else if(circulos[i].getY()<=0){
                    circulos[i].setY(circulos[i].getY()+circulos[i].getRadio()*2);
                }
                else if(circulos[i].getY()>=alto){
                    circulos[i].setY(circulos[i].getY()-circulos[i].getRadio()*2);
                }
                circulos[i].setPrimera(false);
            }
            else{
                circulos[i].setX();
                circulos[i].setY();
                if ((circulos[i].getX()-circulos[i].getRadio())<=0){
                    circulos[i].setX(circulos[i].getX()+circulos[i].getRadio()/8);
                    cambiarX(circulos[i]);
                }
                else if((circulos[i].getX()+circulos[i].getRadio())>=ancho){
                    circulos[i].setX(circulos[i].getX()-circulos[i].getRadio()/8);
                    cambiarX(circulos[i]);
                }
                else if((circulos[i].getY()-circulos[i].getRadio())<=0){
                    circulos[i].setY(circulos[i].getY()+circulos[i].getRadio()/8);
                    cambiarY(circulos[i]);
                }
                else if((circulos[i].getY()+circulos[i].getRadio())>=alto){
                    circulos[i].setY(circulos[i].getY()-circulos[i].getRadio()/8);
                    cambiarY(circulos[i]);
                }
            }
            p.setStyle(Paint.Style.FILL);
            p.setColor(circulos[i].getColor());
            c.drawCircle(circulos[i].getX(),circulos[i].getY(),circulos[i].getRadio(),p);
        }
    }
}
