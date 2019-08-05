class FunDemo4
{
	public static void main(String[] args){
//		int a=add(4,5,9);
//		System.out.println(a);
printCFB(9);
	}

	/*函数重载
	1,同一个类
	2,同名
	3，参数个数不同。或者参数类型不同
	*/

//加法运算。两个整数的和
	public static int add(int a,int b){
		return a+b;
	}

	//加法运算。两个小数的和
	public static double add(double a,double b){
		return a+b;
	}

	//加法运算。三个整数的和
	public static int add(int a,int b,int c){
		return a+b+c;
	}

/*
打印乘法表
*/
public static void printCFB(int num){
	for(int x=1;x<=num;x++){
		for(int y=1;y<=x;y++){
			System.out.print(y+"*"+x+"="+y*x+"\t");
		}
		System.out.println();
	}
}
}