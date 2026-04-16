package basic.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第5章 入出力
 */

public class Question02_2 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		System.out.println("商品の名前と値段を入力してください。\n");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("商品名");
		String itemName = reader.readLine();
		System.out.println("値段");
		//		String itemPrice = reader.readLine();
		int itemPrice = Integer.parseInt(reader.readLine());

		System.out.println("商品の名前は" + itemName + "です。");
		System.out.println("商品の値段は" + itemPrice + "です。");
	}
}
