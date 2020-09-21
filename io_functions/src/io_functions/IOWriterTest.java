package io_functions;

public class IOWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IOWriter.writeIO("test.txt", "UTF8", "Here's some data to write...");
		System.out.println(IOReader.readIO("test.txt", "UTF8"));
	}

}
