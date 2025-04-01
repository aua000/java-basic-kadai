package kadai_15;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		// 車クラスのインスタンスを作成する
		Car_Chapter15 Car = new Car_Chapter15(1,10);
		
		//車クラスのgearChangeメソッドを実行する
		Car.gearChange(3);
		
		//車クラスのrunメソッドを実行する
		Car.run();
	}

}