
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
     Scanner leer=new Scanner(System.in);
     int resp,opc;
     ataque a = new ataque();
     do{
    System.out.println("Juego de pelea, bienvenido jugador 1");
    System.out.println("1. Ver peleadores");
    System.out.println("2. Seleccionar");
        respt=leer.nextInt();
    switch(respt){
        case 1:
        Beedrill.Estadisticas();
        Machamp.Estadisticas();
        Gyarados.Estadisticas();
        Charizad.Estadisticas();


        System.out.println("Escoja su pokemon");
        System.out.println("1. Beedrill");
        System.out.println("2. Machamp");
        System.out.println("3. Gyarados");
        System.out.println("4. Charizad");
        break;
        case 2:
        opc=leer.nextInt();
           if(opc==1){
               Beedrill jugador1=new Beedrill();
           }else if(opc==2){
               Machamp jugador1=new Machamp();
           }else if(opc==3){
               Gyarados jugador1=new Gyarados();
           }else if(opc==4){
               Charizad jugador1=new Charizad();
          }
        if(opc==1){
          Beedrill jugador2=new Beedrill();
        }else if(opc==2){
          Machamp jugador2=new Machamp();
        }else if(opc==3){
          Gyarados jugador2=new Gyarados(); 
        }else if(opc==4){
          Charizad jugador2=new Charizad();
          }
        
        break;

        default:
        System.out.println("opcion incorrecta");
        break;
    }
    }while(resp!=2);
    leer.next();
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
    do{
        System.out.println("Juego lucha, bienvenido jugador 2");
       System.out.println("1. Ver peleadores");
       System.out.println("2. Seleccionar");
           resp=leer.nextInt();
       switch(resp){
           case 1:
           Beedrill.Estadisticas();
           Machamp.Estadisticas();
         break;
       
           case 2:
           System.out.println("Escoja su pokemon");
           System.out.println("1. Beedrill");
           System.out.println("2. Machamp");
           System.out.println("3. Gyarados");
           System.out.println("4. Charizad");

        opc=leer.nextInt();
        if(opc==1){
          Beedrill jugador2=new Beedrill();
        }else if(opc==2){
          Machamp jugador2=new Machamp();
        }else if(opc==3){
          Gyarados jugador2=new Gyarados(); 
        }else if(opc==4){
          Charizad jugador2=new Charizad();
          }
           default:
           System.out.println("opcion incorrecta");
       }
       }while(resp!=2);
    }
