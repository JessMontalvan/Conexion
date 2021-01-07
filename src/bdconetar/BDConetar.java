
package bdconetar;

import java.sql.Connection;

public class BDConetar {

    public static void main(String[] args) {
        // TODO code application logic here
        Conectar op = new Conectar();
        Connection bas = op.con();
        
    }
    
}
