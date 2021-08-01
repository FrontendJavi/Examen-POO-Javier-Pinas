public abstract class Figura implements IFigura {
    protected String colorFondo;
    protected String colorBorde;
    protected Rectangle rectangle;

    public Figura(String colorBorde, String colorFondo, Rectangle rectangle){
        this.colorBorde = colorBorde;
        this.colorFondo = colorFondo;
        this.rectangle = rectangle;
    }

    public Figura(){

    }

    public Rectangle getRectangle(){
        return this.rectangle;
    }

    public void setRectangle(Rectangle rectangle){
        this.rectangle = rectangle;
    }

    public String getcolorFondo(){
        return colorFondo;
    }

    public String getcolorBorde(){
        return colorBorde;
    }

    public void setcolorFondo(String colorFondo){
        this.colorFondo = colorFondo;
    }

    public void setColorBorde(String colorBorde){
        this.colorBorde = colorBorde;
    }

    public void Dibujar(){

    }
}


