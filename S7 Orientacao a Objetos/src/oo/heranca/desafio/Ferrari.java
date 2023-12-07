package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{

    private boolean ligarTurbo = false;
    private boolean ligarAr = false;

    public Ferrari(int i){
        super(315);
    }

    public boolean acelerar(){
        boolean acelerar1 = super.acelerar();
        boolean acelerar2 = super.acelerar();
        boolean acelerar3 = super.acelerar();
        return acelerar1 || acelerar2 || acelerar3;
    }
    
    public boolean frear(){
        boolean frear1 = super.frear();
        boolean frear2 = super.frear();
        boolean frear3 = super.frear();
        return frear1 || frear2 || frear3;
    }

    @Override
    public void ligarTurbo(){
        ligarTurbo = true;
    }
    public void desligarTurbo(){
        ligarTurbo = false;
    }
    
    @Override
    public void ligarAr(){
        ligarAr = true;
    }
    @Override
    public void desligarAr(){
        ligarAr = false;
    }
    
    public int getDelta(){
        if(ligarTurbo && !ligarAr){
            return 35;
        } else if(ligarTurbo && ligarAr){
            return 30;
        }else if(!ligarTurbo && !ligarAr){
            return 20;
        } else {
            return 15;
        }
    }

}
