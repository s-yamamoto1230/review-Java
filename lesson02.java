public class lesson02{
     public static void main(String[] args){
          int age;            //変数宣言
          age = 30;
          final weight = 170; //finalを付けることでweightは書き換え不可になる。
          System.out.println(age);
          age = 300;
          //weight = 200      finalがついている変数を書き換えようとするとエラーになる。
          System.out.println("変数書き換え後は" + age);
     }
}

/*
型一覧
--整数--
long      8バイト +-約900京まで
int       4バイト +-約21億まで
short     2バイト +-約3.2万まで
byte      1バイト +-約128

--少数--
double    8バイトの倍精度浮動小数点実数（有効桁数１６桁）
float     4バイトの単精度浮動小数点実数（有効桁数７桁）

--真偽値--
boolean   trueかfalseを返す

--文字--
char      1つの文字(イニシャル1文字)

--文字列--
Sttring   文字の並び
*/
