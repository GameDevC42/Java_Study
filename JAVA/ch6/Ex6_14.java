package JAVA.ch6;

public class Ex6_14 {
    static int[] arr = new int[10];

	static {
		for(int i=0;i<arr.length;i++) {
			// 1�� 10������ ������ ���� �迭 arr�� �����Ѵ�.
			arr[i] = (int)(Math.random()*10) + 1;
		}
	}

	public static void main(String args[]) {
		for(int i = 0; i < arr.length; i++)
			System.out.println("arr[" + i + "] :" + arr[i]);
	}
}