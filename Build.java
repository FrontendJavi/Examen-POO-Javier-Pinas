public interface Build {
    
    static Figura build(String figura){

        if(figura == FiguraEnum.CORAZON.name()){

            return new Corazon();

        }else if(figura == FiguraEnum.ESTRELLA.name()){

            return new Estrella();

        }else if(figura == FiguraEnum.RAYO.name()){

            return new Rayo();
        }
        return null;
    }
}


