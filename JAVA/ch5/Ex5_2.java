package JAVA.ch5;

public class Ex5_2 {
    public static void main(String[] args){
        int sum = 0; // ������ �����ϱ� ���� ����
        float average = 0f; // ����� �����ϱ� ���� ����

        int[] score = {100, 88, 100, 100, 90};

        for(int i = 0; i < score.length; i++)
            sum += score[i];
        average = sum / (float)score.length;

        System.out.println("���� : " + sum);
        System.out.println("��� : " + average);
    }    
}