public class branch 
{
	public static void main(String[] args)
	{
		boolean bool_data;
		int int_data=3;

		int[] array = new int[5];
		
		// if文の挙動確認
		bool_data = int_data ==3; 		// 条件演算子は基本cと同じ
		if(bool_data)					// if文の括弧内をtrue, falseと直書きしてみる
		{								// 余裕があればC言語流の真(1)、偽(0)も試してみる
			System.out.println("hoge");
		}
		else
			System.out.println("hogehoge");

		// switch文の挙動確認
		// はまったくCと同じなので省略


		// for文の挙動確認
		/*
		for(int j=0; j<array.length; j++)	// for文も基本Cと同じ。length演算子を使うと配列に便利
		{
			array[j] = j;
			System.out.println(array[j]);
		}
		*/


		//while文の挙動確認
		/*
		int_data =5;
		while(true)
		{
			if(int_data <0)					// breakもCと同じ挙動
				break;						// continueも使える
			System.out.println(--int_data); // --i,  i++の挙動も同じなので試してみる
		}
		*/
			
	}
}
