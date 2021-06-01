public class State {
    
    public void StateLogin(String num) {
        
        switch (num) {
                case "1":
                    
                    GoogleAPI g = new GoogleAPI();
                    break;
                    
                case "2":
                    
                    FacebookAPI f = new FacebookAPI();                  
                    break;
                    
            }
        
    }
    
}
