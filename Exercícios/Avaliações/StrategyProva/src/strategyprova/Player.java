package strategyprova;

public class Player {
   private IModoDeSegurarArma modoDeAtirar;
   
   public void segurarArma(){
       modoDeAtirar.pegaArma();
   }
   public void setModoDeSegurarArma(IModoDeSegurarArma modoDeAtirar){
       this.modoDeAtirar = modoDeAtirar;
   }
   
   public IModoDeSegurarArma getModoDeSegurarArma(){
       return modoDeAtirar;
   }
}
