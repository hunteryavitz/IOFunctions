package io_functions;

import java.util.Date;

public class IOSerializationTest {

	public static void main(String[] args) {

		Something something = new Something(42, "The Thing", new Date());
		IOSerialization.serializeIO("thing.ser", something);
		Something somethingElse = IODeserialization.deserializeIO("thing.ser");
		System.out.println("The object int: " + somethingElse.getI());
		System.out.println("The object string: " + somethingElse.getStr());
		System.out.println("The object date: " + somethingElse.getDate());
	}
}
