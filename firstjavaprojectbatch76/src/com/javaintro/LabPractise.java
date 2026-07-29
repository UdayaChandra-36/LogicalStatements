
//Practice question-1
/*
package com.javaintro;
public class LabPractise {
static void method1(){
	LabPractise l2 = new LabPractise();
	l2.method4();
	int a = 10;
	int b = 20;
	System.out.println(a + b);
}
//instance
void method3()
{
	method2();
	int c = 10;
	int d = 20;
	System.out.println(c * d);
}

static void method2() {
	method1();
	int x = 10;
	int y = 20;
	System.out.println(y - x);
}

//instance
void method4()
{

int p = 10;
int q = 20;
System.out.println(q/p);
}
	public static void main(String[] args) {
		LabPractise l1 = new LabPractise();
		l1.method3();
		

	}

}
*/

//Practice question-2


/*
package com.javaintro;
public class LabPractise {
	static {
	new LabPractise();
	}
	
	LabPractise(){
		method1();
		method2();
		method3();
		method4();
	}
	
	
	void method1() {
		
		System.out.println("method1 started");
	}
	
	void method2() {
		
		System.out.println("Method2 started");
	}
	
	void method3() {
		System.out.println("Method3 started");
	}
	void method4() {
		System.out.println("Method4 started");
	}
	public static void main(String[] args) {
		
		
	}
}
*/

package com.javaintro;
public class LabPractise {
	
	static int n = 0;
	LabPractise(){
		n++;
	}
	public static void main(String[] args) {
		LabPractise t = new LabPractise ();
		LabPractise a = new LabPractise ();
		LabPractise b = new LabPractise();
		System.out.println("Object count is : " + LabPractise.n);	
	}	
}









