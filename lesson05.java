public class lesson05{
     public static void main(String[] args){
          System.out.println("最初の数字を入力してください");
          int number1 = new java.util.Scanner(System.in).nextInt();   //数字の入力補完

          System.out.println("次の数字を入力してください");
          int number2 = new java.util.Scanner(System.in).nextInt();   //数字の入力補完

          System.out.println("最後にお名前を入力してください");
          String name = new java.util.Scanner(System.in).nextLine();  //文字の入力補完

          int comparison = Math.max(number1,number2);                 //文字の大小比較。大きいほうを取り出す。minにすると小さいほうを取り出す。
          System.out.println(name + "さんが入力した数字で大きいほうは" + comparison + "です");
     }
}
