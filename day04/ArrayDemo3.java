import java.util.Arrays;

class ArrayDemo3 {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		int[] arr = { -1, -25, -13, -41, -11, -98, -56, -43 };
		int max = getMax(arr);

	/* 	//���ù���������򷽷�
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr)); */

		//�����Լ�д�ġ�ѡ�����򡱷������������������
		// sortXZPX(arr);
		int[] myArr=sortXZPXReturn(arr);
		System.out.println("�Լ�д��ѡ�����򷽷������������Ϊ"+Arrays.toString(myArr));//Ҫ���ӡ������������Arrays.toString(arr);�ķ�ʽ������ת��Ϊ�ַ���
		System.out.println("max:" + max);
	}
	/**
	 * �������е����ֵ
	 * @param arr
	 * @return
	 */
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] > max) {
				max = arr[x];
			}
		}
		return max;
	}
	/**
	 * ѡ�����򷨣��������飬������ֵ
	 * @param arr
	 */
	public static void sortXZPX(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			int tem=i;
			//�������д�i��ʼ����С��Ԫ������λ�õ�������ֵ��tem
			for (int j = i; j < arr.length; j++) {
				if(arr[j]<arr[tem]){
					tem=j;
				}
			}
			//�����ȡ�������д�i��ʼ����Сֵ��λ������Ϊtem�����ø���������iλ�ϵ�Ԫ��������н���
			int temp1=arr[i];
			arr[i]=arr[tem];
			arr[tem]=temp1;
		}
		// return arr;
	}
	
	/**
	 * ѡ�����򷨣��������飬��������֮�������
	 * @param arr
	 * @return
	 */
	public static int[] sortXZPXReturn(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			int tem=i;
			//�������д�i��ʼ����С��Ԫ������λ�õ�������ֵ��tem
			for (int j = i; j < arr.length; j++) {
				if(arr[j]<arr[tem]){
					tem=j;
				}
			}
			//�����ȡ�������д�i��ʼ����Сֵ��λ������Ϊtem�����ø���������iλ�ϵ�Ԫ��������н���
			int temp1=arr[i];
			arr[i]=arr[tem];
			arr[tem]=temp1;
		}
		return arr;
	}
}