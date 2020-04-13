public class lesson09{
     public static void main(String[] args){
          System.out.println("¡“ú‚Ì‰^¨‚Í");
          int fortune = new java.util.Random().nextInt(4);  //0‚©‚ç3‚Ìƒ‰ƒ“ƒ_ƒ€‚È”š‚ğfortune‚É‘ã“ü

          switch(fortune){
               case 0: System.out.println("‘å‹g");
               break;
               case 1: System.out.println("’†‹g");
               break;
               case 2: System.out.println("‹g");
               break;
               case 3: System.out.println("‹¥");
               break;
          }
     }
}
