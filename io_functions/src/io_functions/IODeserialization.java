package io_functions;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class IODeserialization {

	public static Something deserializeIO(String file) {
		int i = 0;
		String str = null;
		Date date = null;
		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
			i = (int) in.readObject();
			str = (String) in.readObject();
			date = (Date) in.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Something something = new Something(i, str, date);
		return something;
	}
}
