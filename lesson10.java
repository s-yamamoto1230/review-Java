public class lesson10{
     public static void main(String[] args){
          for(int i = 0; i <= 10; i++){
               if(i%3 == 0){
                    continue;      //３の倍数の時は繰り返しを中断して次の周へ
               }
               System.out.print("現在の数" + i);
               if(i == 10){
                    break;         //iが10ならここで繰り返しが終わり
               }else{
                    System.out.print("→");
               }
          }
     }
}
