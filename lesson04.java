public class lesson04{
     public static void main(String[] args){
          String a = "3";               //文字の３
          int b =Integer.parseInt(a);   //文字だった３を数字の３に変換
          double c = (double)b;         //キャストして整数から小数点付きの数字に変換
          System.out.println("double型で数字の" + c);

          String d = String.valueOf(c); //数字の3.0を文字に変換
          System.out.println("String型で文字の" + d);
     }
}
