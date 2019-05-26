package mx.edu.ittepic.anelcruzag.tpdm_u4_practica1_angelcruz;

import android.graphics.Color;

public class Circulo {
    private int radio, x, y, incrementaX, incrementaY, direccion, color;
    private boolean primera, tipoX, tipoY;

    public Circulo(){
        radio=x=y=incrementaX=incrementaY=direccion=0;
        color=Color.RED;
        primera=true;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setX(){
        x=x+incrementaX;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setY(){
        y=y+incrementaY;
    }

    public int getIncrementoX() {
        return incrementaX;
    }

    public void setIncrementoX(int incrementaX) {
        this.incrementaX = incrementaX;
    }

    public int getIncrementoY() {
        return incrementaY;
    }

    public void setIncrementoY(int incrementaY) {
        this.incrementaY = incrementaY;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
        switch (this.direccion){
            case 1:
                incrementaY=(radio<100)?10:5;
                incrementaX=0;
                break;
            case 2:
                incrementaY=(radio<100)?10:5;
                incrementaX=0;
                break;
            case 3:
                incrementaX=(radio<100)?10:5;
                incrementaY=0;
                break;
            case 4:
                incrementaX=(radio<100)?10:5;
                incrementaY=0;
                break;
            case 5:
                incrementaX=(radio<100)?10:5;
                incrementaY=(radio<100)?-10:-5;
                tipoX=true;
                tipoY=false;
                break;
            case 6:
                incrementaX=incrementaY=(radio<100)?10:5;
                tipoX=tipoY=true;
                break;
            case 7:
                incrementaX=(radio<100)?-10:-5;
                incrementaY=(radio<100)?10:5;
                tipoX=false;
                tipoY=true;
                break;
            case 8:
                incrementaX=incrementaY=(radio<100)?-10:-5;
                tipoX=tipoY=false;
        }
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public boolean isPrimera() {
        return primera;
    }

    public void setPrimera(boolean primera) {
        this.primera = primera;
    }

    public boolean isTipoX() {
        return tipoX;
    }

    public void setTipoX(boolean tipoX) {
        this.tipoX = tipoX;
    }

    public boolean isTipoY() {
        return tipoY;
    }

    public void setTipoY(boolean tipoY) {
        this.tipoY = tipoY;
    }

    public void incrementaX(int direccion){
        switch (direccion){
            case 1:
                incrementaX=incrementaY=(radio<100)?-10:-5;
                tipoX=tipoY=false;
                break;
            case 2:
                incrementaX=(radio<100)?-10:-5;
                incrementaY=(radio<100)?10:5;
                tipoX=false;
                tipoY=true;
                break;
            case 3:
                incrementaX=(radio<100)?-10:-5;
                incrementaY=0;
                break;
            case 4:
                incrementaY=(radio<100)?10:5;
                incrementaX=0;
                break;
            case 5:
                incrementaY=(radio<100)?-10:-5;
                incrementaX=0;
                break;
        }
    }

    public void decrementaX(int direccion){
        switch (direccion){
            case 1:
                incrementaX=incrementaY=(radio<100)?10:5;
                tipoX=tipoY=true;
                break;
            case 2:
                incrementaX=(radio<100)?10:5;
                incrementaY=(radio<100)?-10:-5;
                tipoX=true;
                tipoY=false;
                break;
            case 3:
                incrementaX=(radio<100)?10:5;
                incrementaY=0;
                break;
            case 4:
                incrementaY=(radio<100)?10:5;
                incrementaX=0;
                break;
            case 5:
                incrementaY=(radio<100)?-10:-5;
                incrementaX=0;
                break;
        }
    }

    public  void incrementaY(int direccion){
        switch (direccion){
            case 1:
                incrementaX=incrementaY=(radio<100)?-10:-5;
                tipoX=tipoY=false;
                break;
            case 2:
                incrementaX=(radio<100)?10:5;
                incrementaY=(radio<100)?-10:-5;
                tipoX=true;
                tipoY=false;
                break;
            case 3:
                incrementaX=(radio<100)?-10:-5;
                incrementaY=0;
                break;
            case 4:
                incrementaY=(radio<100)?-10:-5;
                incrementaX=0;
                break;
            case 5:
                incrementaX=(radio<100)?10:5;
                incrementaY=0;
                break;
        }
    }

    public void decrementaY(int direccion){
        switch (direccion){
            case 1:
                incrementaX=incrementaY=(radio<100)?10:5;
                tipoX=tipoY=true;
                break;
            case 2:
                incrementaX=(radio<100)?-10:-5;
                incrementaY=(radio<100)?10:5;
                tipoX=false;
                tipoY=true;
                break;
            case 3:
                incrementaX=(radio<100)?-10:-5;
                incrementaY=0;
                break;
            case 4:
                incrementaY=(radio<100)?10:5;
                incrementaX=0;
                break;
            case 5:
                incrementaX=(radio<100)?10:5;
                incrementaY=0;
                break;
        }
    }
}
