package JAVA.ch8;

public class Ex8_5 {
    public static void main(String[] args){
        System.out.println(1);
        System.out.println(2);

        try{
            System.out.println(3);
            System.out.println(0 / 0); // ArithmeticException
            System.out.println(4);
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
            System.out.println("���ܸ޽��� : " + ae.getMessage());
        } // try-catch�� ��
        System.out.println(6);
    } // main�޼����� ��    
}