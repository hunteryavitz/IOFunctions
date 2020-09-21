package io_functions;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOReader {

	public static String readIO(String file, String encodedAs) {
		StringBuilder text = new StringBuilder();
		try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file), encodedAs))) {
			String line;
			while ((line = in.readLine()) != null) {
				text.append(line).append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return String.valueOf(text);
	}
}
