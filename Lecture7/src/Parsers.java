import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parsers {

	public static void main (String[] args) {
		parseStudentsCSV("data/students.csv");
	}

	public static void parseIntList(String filename) {
		File inputFile = new File(filename);
		try {
			Scanner inputScanner = new Scanner(inputFile);
			int count = 0;
			int sum = 0;
			while (inputScanner.hasNextInt()) {
				int nextNumber = inputScanner.nextInt();
				count++;
				sum += nextNumber;
				System.out.println("Next Number (" + count + "): " + nextNumber);
			}
			System.out.println("Sum =  " + sum);

		} catch (FileNotFoundException e) {
			throw new RuntimeException("Fatal Error: File not Found");
		}
	}

	public static void parseStudentsCSV(String filename) {
		File inputFile = new File(filename);
		try {
			Scanner inputScanner = new Scanner(inputFile);
			String headerLine = inputScanner.nextLine();
			inputScanner.useDelimiter(",");
			while (inputScanner.hasNextLine()) {
				String ID = inputScanner.next();
				System.out.println("Next ID: " + ID);
				String restOfLine = inputScanner.nextLine();
			}
			
		}
		catch (FileNotFoundException e) {
			throw new RuntimeException("Fatal Error: File not Found");
		}

	}
}
