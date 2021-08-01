public class Rayo extends Figura implements IFigura{
    public Rayo(String colorBorde, String colorFondo, Rectangle rectangle){
        super(colorBorde, colorFondo, rectangle);
    }

    public Rayo(){

    }

    public void Draw(){
        //añadir corazón al lienzo
        System.out.println("Soy un rayo");
        
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
