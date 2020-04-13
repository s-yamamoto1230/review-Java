public class lesson07{
     public static void main(String[] args){
          boolean kye = true;
          //前判定  while(条件を見てからwhileに入る)
          while(kye == false){                         //kyeがfalse間はループする
               System.out.println("鍵がかかってます");
               System.out.println("今あけます");
          }
          System.out.println("鍵が開きました");
          //後判定  do-while(とりあえず一回回してからwhile条件を見る)
          do{
               System.out.println("鍵がかかってます");
               System.out.println("今あけます");
          }while(kye == false);
          System.out.println("鍵が開きました");
     }
}
