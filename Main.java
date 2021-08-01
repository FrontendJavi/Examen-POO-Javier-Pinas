public class Main {
    
    public static void main(String[] args) throws Exception{
        
        Lienzo lienzo = new Lienzo();

        Figura figura = Build.build("CORAZON");
        figura.getClass().getName();
        lienzo.add(figura, new Rectangle(new Point(3, 3) , new Point(4, 4)));

        Figura figura2 = Build.build("ESTRELLA");
        figura2.getClass().getName();
        lienzo.add(figura2, new Rectangle(new Point(2, 2) , new Point(4, 4)));

        Figura figura3 = Build.build("RAYO");
        figura3.getClass().getName();
        lienzo.add(figura3, new Rectangle(new Point(3, 3) , new Point(4, 4)));
        

        lienzo.getSelected(new Point(5, 5));

        System.out.println("Soy un " + figura.getClass().getName());
        System.out.println("Soy un " + figura2.getClass().getName());
        System.out.println("Soy un " + figura3.getClass().getName());

        lienzo.add(figura, new Rectangle(new Point(2, 3), new Point(4, 5)));


    }
}
