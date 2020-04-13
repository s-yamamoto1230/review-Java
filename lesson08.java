public class lesson08{
     public static void main(String[] args){
          String name = "田中";
          int age = 15;
          while(name.equals("田中") && age < 21){   //nameが田中でageが21より小さい間ループする
               System.out.println(name);
               System.out.println(age);
               if(age > 21){                      //ageが21より大きいならnameを吉田にする(21は入らない)
                    name = "吉田";
               }
               else{                              //ageが21より小さいならageをプラス1する
                    age++;
               }
          }
     }
}

/*
.equals →String型で等しい
!(.equals) →String型で等しくない
==  →int型で等しい
!=  →int型で等しくない
&&  →かつ(両方一致)
||  →または(どちらか片方一致)
a<b   →aよりbが大きい(aは含まない)
a<=b  →bがa以上(aも含む)
a>b   →bよりaが大きい(bは含まない)
a>=b  →aがb以上(bも含む)
*/
