package com.example.operations;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class FileOperations{
	List<String> list= new ArrayList<String>();
	File directoryPath = new File("F:\\Users\\sound\\Documents\\Eclipse_Workspace\\Demo\\VirtualKey");
	
	
	
	public void showFiles() {
		// TODO Auto-generated method stub
		String filesList[] = directoryPath.list();
		for(int i=0;i<filesList.length;i++) 
		{
			System.out.println(filesList[i]);
			
		}
		
		
		
	}

  
	public void addFile() {
	   boolean success = false;
		// TODO Auto-generated method stub
		System.out.println("Enter the filename:");
		
		Scanner scan=new Scanner(System.in);
		String filename=scan.nextLine();
		File f= new File(filename);
		try {
		if(f.exists()) {
			System.out.println("File already exists");
		}
		else
		{
			System.out.println("No such file exists, creating now");
			success =f.createNewFile();
			if(success) {
				System.out.println("Successfully created new file");
			}
			else
			{
				System.out.println("Failed to create new file");
			}
		}
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	
	public void deleteFile() {
		// TODO Auto-generated method stub
		System.out.println("Enter the filename to delete:");
	
		Scanner scan=new Scanner(System.in);
		String filename=scan.nextLine();
		File f= new File(filename);
		if(f.delete())
			System.out.println("File Deleted Successfully");
		else
			System.out.println("Failed to delete the file");
	}

	
	public void searchFile() {
		// TODO Auto-generated method stub	
			Scanner scan= new Scanner(System.in);
			File directory = new File("F:\\Users\\sound\\Documents\\Eclipse_Workspace\\Demo\\VirtualKey");
			System.out.println("Enter the filename to search:");
			String fileName=scan.nextLine();
			String flist[] = directory.list();
            int flag=0;
            if(flist == null) {
            	System.out.println("Empty Directory");
            }
            else
            {
            	for(int i=0;i<flist.length;i++)
            	{
            		String filenm= flist[i];
            		if(filenm.equalsIgnoreCase(fileName)) {
            			System.out.println(filenm + "found at index "+i );
            			flag =1;
            		}
            	}
            }
            
        if(flag==0) {
        	System.out.println("File not found");
        }
        	
		
		
	}

}

