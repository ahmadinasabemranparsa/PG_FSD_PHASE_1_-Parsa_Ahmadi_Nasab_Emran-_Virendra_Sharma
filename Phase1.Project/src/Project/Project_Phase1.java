package Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Project_Phase1 {
	
	//file names include the directory path + name of file + extension for the file
	//for example: users/parsatempleowl/Desktop/parsa_aboutme.txt
	//this format will be used when adding a file, deleting a file, and searching for a file in a directory list
	
	public void displayMainMenu () {
		System.out.println("1. should return the current file names in the directory in ascending order");
		System.out.println("2. should return the details of the user interface such as options displaying the following:");
		System.out.println("A. add a file to the existing directory list");
		System.out.println("B. delete a user specified file from the existing directory list");
		System.out.println("C. search a user specified file from the main directory list");
		System.out.println("3. cliose the application");
	}
	
	public void displayFileNamesInDirectory (String directoryPath) throws IOException {
		File fileDir = new File(directoryPath);
		if (fileDir.isDirectory() == true) {
			List listFile = Arrays.asList(fileDir.list());
			Collections.sort(listFile);
			for (int i = 0; i < listFile.size(); i++) {
				System.out.println(listFile.get(i));
			}
		}
		else {
			throw new IOException("directory does not exist/directory was not found");
		}
	}
	
	public void addFileToDirectory (String fileName) throws Exception{
		File file = new File(fileName);
		if (file.exists() == true) {
			throw new FileAlreadyExistsException("file already exists");
		}
		else {
			try {
				file.createNewFile();
				System.out.println("file was created");
			}
			catch(IOException ioe) {
				System.out.println(ioe);
			}
		}
	}
	
	public void deleteFileFromDirectory (String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		if (file.delete() == true) {
			System.out.println("file was deleted");
		}
		else {
			throw new FileNotFoundException("file was not found");
		}
	}
	
	public void searchFileInDirectory (String fileName, String directoryPath) throws Exception {
		File fileDir = new File(directoryPath);
		File file = new File(fileName);
		
		if (fileDir.isDirectory() == true) {
			List listFile = Arrays.asList(fileDir.list());
			if (listFile.contains(file) == true) {
				System.out.println(file);
			}
			else {
				throw new FileNotFoundException("file was not found");
			}
		}
		else {
			throw new IOException("directory does not exist/directory was not found");
		}
	}
	
	public void closeTheApplication () {
		System.out.println("Application is now exiting...");
		System.out.println("Application has now exited...");
		System.exit(0);
	} 
	
class FileAlreadyExistsException extends Exception {
	FileAlreadyExistsException (String s) {
		super(s);
	}
}

	public static void main(String[] args) throws Exception {
		Project_Phase1 obj = new Project_Phase1();
		
		Scanner scanner = new Scanner(System.in);
		
		boolean flag = true;
		
		while (flag == true) {
		
			obj.displayMainMenu();
			
			System.out.println("Please select an option from the list above: ");
			String selectedOption = scanner.next();
			
			switch(selectedOption) {
			case "1":
				System.out.println("Please enter a directory path: ");
				String directoryPath = scanner.next();
				obj.displayFileNamesInDirectory(directoryPath);
				break;
			case "A":
				System.out.println("Please enter a filename: ");
				String fileName1 = scanner.next();
				obj.addFileToDirectory(fileName1);
				break;
			case "B":
				System.out.println("Please enter a filename: ");
				String fileName2 = scanner.next();
				obj.deleteFileFromDirectory(fileName2);
				break;
			case "C":
				System.out.println("Please enter a directory path: ");
				String directoryPath1 = scanner.next();
				System.out.println("Please enter a filename: ");
				String fileName3 = scanner.next();
				obj.searchFileInDirectory(fileName3, directoryPath1);
				break;
			case "3":
				flag = false;
				obj.closeTheApplication();
				break;
			}
		}
	}

}
