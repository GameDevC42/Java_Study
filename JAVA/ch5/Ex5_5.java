package JAVA.ch5;

public class Ex5_5 {
    public static void main(String[] args){
        int[] ball = new int[45];

        // �迭�� �� ��ҿ� 1 ~ 45�� ���� �����Ѵ�.
        for(int i = 0; i < ball.length; i++)
            ball[i] = i + 1;

        int tmp = 0; // �� ���� �ٲٴµ� ����� �ӽú���
        int j = 0;   // ������ ���� �� ������ ����

        // �迭�� i��° ��ҿ� ������ ��ҿ� ����� ���� ���� �ٲ㼭 ���� ���´�.
        // 0���� ���� 5��° ��ұ��� ��� 6���� �ٲ۴�.
        for(int i = 0; i < 6; i++){
            j = (int)(Math.random() * ball.length); // 0 ~ 44������ ���ǰ�
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
        }

        // �迭 ball�� �տ������� 6���� ��Ҹ� ����Ѵ�.
        for(int i = 0; i < 6; i++)
            System.out.println("ball[" + i + "] = " + ball[i]);

    }
}