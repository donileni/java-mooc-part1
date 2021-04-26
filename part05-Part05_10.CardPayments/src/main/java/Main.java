
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here
        
        PaymentCard antons = new PaymentCard(10); 
        
        System.out.println(antons.balance());
        
        antons.takeMoney(8); 
        
        System.out.println(antons.balance());
        
        
        PaymentTerminal antonsTerminal = new PaymentTerminal(); 
        
        double change = antonsTerminal.eatAffordably(10); 
        
        System.out.println(change);
                
        
        System.out.println(antonsTerminal);
        
        PaymentCard antonsCard = new PaymentCard(7); 
        
        boolean wasSuccessfull = antonsTerminal.eatAffordably(antonsCard); 
        System.out.println(wasSuccessfull);
        
        System.out.println(antonsTerminal);
        System.out.println(antonsCard.balance());
        
        
        
    }
}

