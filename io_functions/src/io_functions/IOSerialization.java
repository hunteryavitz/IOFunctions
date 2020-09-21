package io_functions;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IOSerialization {

	public static void serializeIO(String file, Something something) {
		try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
			out.writeObject(something.getI());
			out.writeObject(something.getStr());
			out.writeObject(something.getDate());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
