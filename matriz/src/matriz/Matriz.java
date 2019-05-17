
package matriz;
import javax.swing.JOptionPane;


public class Matriz {

    public static void main(String[] args) {
               
         int tr1=0,tr2=0,tr3=0,tr4=0, sabor=0;
    //int cafefrio [][]= new int [4][4];
         int cafeFrio [][]= { {111,483,471,427},{192,500,355,158},{289,470,474,160},{415,114,161,308} };  
        
        //imprimo la matriz para verificar que es la correcta 
         System.out.println ("la matriz es ....");
    
          for(int i=0;i<4;i++){
          for(int j=0;j<4;j++){
        
        System.out.print(cafeFrio[i][j]+ " ");
        }
        System.out.println(" ");          
    }
    
         for(int i=0;i<4;i++){
            tr1 += cafeFrio [i][0] ;
           }
        System.out.println(tr1 + "es la suma del primer trimestre");
    
         for(int i=0;i<4;i++){
           tr2 += cafeFrio [i][1] ;
           }
        System.out.println(tr2 + "es la suma del segundo trimestre");
    
        for(int i=0;i<4;i++){
          tr3 += cafeFrio [i][2] ;
           }
        System.out.println(tr3 + "es la suma del tercer trimestre");
    
    
        for(int i=0;i<4;i++){
         tr4 += cafeFrio [i][3] ;
           }
        System.out.println(tr4 + "es la suma del cuarto trimestre");
    
          if ((tr1>tr2)&&(tr2>tr3)&&(tr3>tr4)){
            System.out.print("el trimestre que mas vendio fue enero-marzo  con "+tr1+" ventas realizadas"); 
        
              }
         else  if ((tr2>tr3)&&(tr3>tr4)){
            System.out.print("el trimestre que mas vendio fue abril-junio  con "+tr2+" ventas realizadas"); 
        
              }
         else if (tr3>tr4){
            System.out.print("el trimestre que mas vendio fue julio-septiembre  con "+tr3+" ventas realizadas");
              }
         else if (tr3<tr4){
            System.out.print("el trimestre que mas vendio fue octubre-diciembre  con "+tr4+" ventas realizadas");
                
              }
    
  
    
    
    }
  }
