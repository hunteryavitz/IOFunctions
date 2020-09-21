package io_functions;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class IOWriter {

	public static void writeIO(String file, String encodedAs, String data) {
		try (BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), encodedAs))) {
			out.write(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}