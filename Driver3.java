//package project1;
//import java.util.*;
//
//public class Driver3 {
//    
//    public static void main(String[] args) {
//        
//        RIsl a = new RIsl();
//        
//        System.out.println("You are in the center of a square island. \n" +
//"Use 1=North, 2=South, 3=East 4= West");
//        
//        Scanner U = new Scanner(System.in);
//        
//        while(true) {
//            
//            System.out.print("Direction? ");
//            int dir = U.nextInt();
//
//            System.out.print("Distance? ");
//            int dist = U.nextInt();
//
//            if (dist > 10 || dist < 0) System.out.println("DISTANCE SHOULD BE LESS OR EQUAL THAN 10 METERS");
//            else {
//        
//                switch(dir) {
//
//                    case 1: a.playery += dist; break;
//
//                    case 2: a.playery -= dist; break;
//
//                    case 3: a.playerx += dist; break;
//
//                    case 4: a.playerx -= dist; break;
//
//                }
//
//                System.out.println("You are " + (int)RIsl.distance(a.x, a.y, a.playerx, a.playery) + " meters away from the treasure.");
//                
//                if(RIsl.crossedTheBorder(a.playerx, a.playery)) {
//                
//                    System.out.println("You fell in the ocean!");
//                    
//                    break;
//                }
//                    
//                if(RIsl.distance(a.x, a.y, a.playerx, a.playery)< 3) {
//                
//                    System.out.println("Success! You found the treasure!");
//                    
//                    break;
//                
//                }
//                
//            }
//        }
//
//    }
//    
//    
//}
