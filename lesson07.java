public class lesson07{
     public static void main(String[] args){
          boolean kye = false;
          while(kye == false){                         //kyeがfalseの間はループする
               System.out.println("鍵がかかってます");
               System.out.println("今開けます");
               kye = true;                             //kyeをtrueにする
          }
          System.out.println("鍵が開きました");
     }
}
