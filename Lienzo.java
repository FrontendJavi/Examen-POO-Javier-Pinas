import java.util.ArrayList;
import java.util.List; 
import java.util.*;

public class Lienzo implements IFigura {
    Figura figura;
    IFigura iFigura;
    List<Figura> listaFiguras = new ArrayList<>();

    public void Dibujar(){
        figura.getColorBorde();
        figura.getColorFondo();
        figura.setColorBorde("Negro");
        figura.setcolorFondo("Blanco");
    }
 
    public void add(Figura figura, Rectangle rectangle){
        figura.setRectangle(rectangle);
        listaFiguras.add(figura);
        figura.Dibujar();
        figura.setColorBorde("Negro");
        figura.setcolorFondo("Blanco");
        System.out.println("Soy de color " + figura.getColorBorde());
    }

    public String getSelected(Point point){
        for(int i=0; i<listaFiguras.size(); i++){  

          if(listaFiguras.get(i).getRectangle().buscarFigura(point)){
              System.out.println("Esto es un " + listaFiguras.get(i).getClass().getName());
              break;
          } 
              System.out.println("No hay ninguna forma");
         }  
          return "Aquí no hay nada";

    }


    @Override
    public void setColorFondo(String colorFondo) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getColorFondo() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setColorBorde(String colorBorde) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getColorBorde() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setRectangle(Rectangle rectangle) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Rectangle getRectangle() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void Draw() {
        // TODO Auto-generated method stub
        
    }
}



    