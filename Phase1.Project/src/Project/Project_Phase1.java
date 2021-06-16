package Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Project_Phase1 {
	protected String directoryPath;
	protected File file;
	protected String fileName;
	
	public void displayMainMenu () {
		System.out.println("1. return the current file names in the directory in ascending order");
		System.out.println("2: return the details of the user interface: ");
		System.out.println("A. Add a file to the existing directory list");
		System.out.println("B. Delete a file from the existing directory list");
		System.out.println("C. Search for a file in the existing directory name");
		System.out.println("3. Close the application");
	}
	
	public void displayDirectoryList (String directoryPath) throws IOException {
		File directoryFiles = new File(directoryPath);
		this.directoryPath = directoryPath;
		
		if (directoryFiles.isDirectory() == true) {
			List listOfFilesInDirectory = Arrays.asList(directoryFiles.list());
			Collections.sort(listOfFilesInDirectory);
			System.out.println("Sorting by filename in ascending order: ");
			for (int i = 0; i < listOfFilesInDirectory.size(); i++) {
				System.out.println(listOfFilesInDirectory.get(i));
			}
		}
		else {
			throw new IOException("given directory path does not exist: " + this.directoryPath);
		}
		
	}
	
	public void addFileToDirectoryList (String fileName) throws IOException {
		this.file = new File(fileName);
		this.fileName = fileName;
		if (this.file.createNewFile() == true) {
			System.out.println("new file is created");
		}
		else {
			System.out.println("file already exists: " + this.fileName);
		}
	}
	
	public void deleteFileFromDirectoryList (String fileName) throws FileNotFoundException {
		this.file = new File(fileName);
		this.fileName = fileName;
		if (file.delete() == true) {
			System.out.println("file has been deleted");
		}
		else {
			throw new FileNotFoundException("file was not found: " + this.fileName);
		}
	}
	
	public void searchForFileInDirecotry (String fileName, String directoryPath) throws Exception {
		this.file = new File(fileName);
		this.fileName = fileName;
		List listOfFilesInDirectory = getDirectoryList(this.directoryPath);
		if (listOfFilesInDirectory.contains(file) == true) {
			System.out.println(file);
		}
		else {
			throw new Exception("file was not found: " + this.fileName);
		}
	}
	
	public List getDirectoryList(String directoryPath) throws IOException {
		List listOfFilesInDirectory;
		
		File directoryFiles = new File(directoryPath);
		this.directoryPath = directoryPath;
		
		if (directoryFiles.isDirectory() == true) {
			listOfFilesInDirectory = Arrays.asList(directoryFiles.list());
		}
		else {
			throw new IOException("given directory path does not exist: " + this.directoryPath);
		}
		
		return listOfFilesInDirectory;
	}
	
	public void closeTheApplication () {
		System.exit(0);
	}
	
	

	public static void main(String[] args) throws Exception {
		Project_Phase1 obj = new Project_Phase1();
		
		int num = 1; String s = "A";
		
		Scanner scanner = new Scanner(System.in);
		
		obj.displayMainMenu();
		
		System.out.println("Please select an option from the list below: ");
		
		if (scanner.hasNext() == true) {
			s = scanner.next();
		}
		else if (scanner.hasNextInt() == true) {
			num = scanner.nextInt();
		}
		
		System.out.println("Please enter a directory path: ");
		String directoryPath = scanner.next();
		
		System.out.println("Please enter a filename you would like to add to the directory: ");
		String fileName1 = scanner.next();
		
		System.out.println("Please enter a filename you would like to delete from the directory: ");
		String fileName2 = scanner.next();
		
		System.out.println("Please enter a filename you would like to search for in the directory: ");
		String fileName3 = scanner.next();
		
		switch (num) {
		case 1:
			obj.displayDirectoryList(directoryPath);
			break;
		case 3:
			obj.closeTheApplication();
			break;
		}
		
		switch(s) {
		case "A":
			obj.addFileToDirectoryList(fileName1);
			break;
		case "B":
			obj.deleteFileFromDirectoryList(fileName2);
			break;
		case "C":
			obj.searchForFileInDirecotry(fileName3, directoryPath);
			break;
		}
		
	}

}
