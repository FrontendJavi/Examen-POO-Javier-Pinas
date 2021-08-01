public class Estrella extends Figura implements IFigura{

    public Estrella(String colorBorde, String colorFondo, Rectangle rectangle){
        super(colorBorde, colorFondo, rectangle);
    }

    public Estrella(){

    }
    public void Draw(){
        //añadir corazón al lienzo
        System.out.println("Soy una estrella");
        setColorBorde(colorBorde);
        setcolorFondo(colorFondo);
    }
    @Override
    public void setColorFondo(String colorFondo) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public String getColorFondo() {
        // TODO Auto-generated method stub
        return colorFondo;
    }
    @Override
    public String getColorBorde() {
        // TODO Auto-generated method stub
        return colorBorde;
    }
}
