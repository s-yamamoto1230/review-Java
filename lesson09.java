public class lesson09{
     public static void main(String[] args){
          System.out.println("�����̉^����");
          int fortune = new java.util.Random().nextInt(4);  //0����3�̃����_���Ȑ�����fortune�ɑ��

          switch(fortune){
               case 0: System.out.println("��g");
               break;
               case 1: System.out.println("���g");
               break;
               case 2: System.out.println("�g");
               break;
               case 3: System.out.println("��");
               break;
          }
     }
}
