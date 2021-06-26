package Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Project_Phase1 {
	public static void displayMainMenu () {
		System.out.println("1. Should return the current file names in ascending order");
		System.out.println("2. Should return the details of the user interface such as options displaying the following: ");
		System.out.println("A. Add a file to the existing directory list");
		System.out.println("B. Delete a user specified file from the existing directory list");
		System.out.println("C. Search a user specified file in the main directory");
		System.out.println("3. Close the application");
	}
	public static void displayFileNamesInDirectory (String directorypPath) throws IOException {
		File fileDir = new File(directorypPath);
		if (fileDir.isDirectory() == true) {
			List listFile = Arrays.asList(fileDir.list());
			Collections.sort(listFile);
			for (int i = 0; i < listFile.size(); i++) {
				System.out.println(listFile.get(i));
			}
		}
		else {
			throw new IOException("directory does not exist");
		}
	}
	public void addFileToDirectory (String fileName, String directoryPath) throws FileAlreadyExistsException  {
		File file = new File(directoryPath + fileName);
		boolean fileAlreadyExists = file.exists();
		if (fileAlreadyExists) {
			throw new FileAlreadyExistsException("file already exists");
		}
		else {
			try {
				file.createNewFile();
				System.out.println("file was created");
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
	public class FileAlreadyExistsException extends Exception {
		FileAlreadyExistsException (String s) {
			super(s);
		}
	}
	public static void deleteFileFromDirectory (String fileName, String directoryPath) throws FileNotFoundException {
		File file = new File(directoryPath + fileName);
		boolean fileWasDeleted = file.delete();
		if (fileWasDeleted) {
			System.out.println("file was deleted");
		}
		else {
			throw new FileNotFoundException("file was not found");
		}
	}
	public static void searchFileInDirectory (String fileName, String directoryPath) throws FileNotFoundException {
		File fileDir = new File(directoryPath);
		if (fileDir.isDirectory() == true) {
			List listFile = Arrays.asList(fileDir.list());
			if (listFile.contains(fileName)) {
				System.out.println("file was found");
			}
			else {
				throw new FileNotFoundException("file was not found");
			}
		}
	}
	public static void main (String[] args) throws Exception {
		Project_Phase1 obj = new Project_Phase1();
		Scanner scanner = new Scanner(System.in);
		String directoryPath, fileName, selectedOption;
		char input;
		System.out.println("Parsa Ahmadi Nasab Emran, parsaahmadinasabemran18@gmail.com");
		System.out.println("Application lists content of a Directory and Adds, Deletes, or Searches for a file");
		System.out.println("Please enter a directory path: ");
		directoryPath = scanner.next();
		do {
			displayMainMenu();
			System.out.println("Please select an option from the list above: ");
			selectedOption = scanner.next();
			switch(selectedOption) {
			case "1":
				displayFileNamesInDirectory(directoryPath);
				break;
			case "A":
				System.out.println("Please enter a filename: ");
				fileName = scanner.next();
				obj.addFileToDirectory(fileName, directoryPath);
				break;
			case "B":
				System.out.println("Please enter a filename: ");
				fileName = scanner.next();
				deleteFileFromDirectory(fileName, directoryPath);
				break;
			case "C":
				System.out.println("Please enter a filename: ");
				fileName = scanner.next();
				searchFileInDirectory(fileName, directoryPath);
				break;
			case "3":
				System.exit(0);
			}
			System.out.println("Do you want to continue (y/n)? ");
			input = scanner.next().charAt(0);
		} while (input == 'Y' || input == 'y');
	}
}
