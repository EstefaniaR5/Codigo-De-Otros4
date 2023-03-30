import java.util.Scanner; //se importa libreria de Scanner 

public class codigo_otros4 {
	public static void main(String[] args) { // Se agrega metodo main
	    Scanner s = new Scanner(System.in); //se agrega System.in dentro de Scanner
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    // se corrige el System.out.println para el turno del jugador 2
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    Scanner s2 = new Scanner(System.in); //se agrega System.in dentro de Scanner
	    String j2 = s2.nextLine(); //se agrega el 2 a 's2'
	    
	    if (j1 == j2) { //se quita un parentesis de más
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      
	      switch(j1) {
	        case "piedra":
	          if (j2.equals("tijeras")){ //en vez de == se cambia a 'equals'
	            g = 1;
	          }//se cierra llave después de cada if y antes del break
	          break; //se agregan los breaks en cada caso
	          
	        case "papel":
	          if (j2.equals("piedra")) {
	            g = 1;
	          } //se cierra llave después de cada if y antes del break
	          break;//se agregan los breaks en cada caso
	          
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1;
	          }//se cierra llave después de cada if y antes del break
	          break;//se agregan los breaks en cada caso
	          
	        default:
	      }
	      System.out.println("Gana el jugador " + g);
	    }
    }
}