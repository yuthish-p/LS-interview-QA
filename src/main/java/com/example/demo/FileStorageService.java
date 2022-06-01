package com.example.demo;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import antlr.StringUtils;

@Service
public class FileStorageService {

	  
	         @Autowired 
	         private static studentRespotry StudentRespotry; 
	  
	         public static data store(MultipartFile file) throws IOException { 
	               
	                 data FileDB = new data(); 
	  
	                 FileDB.getPdffile();
	                 
						return StudentRespotry.save(FileDB);
					
	         } 
	  
	         public data getFile(String id) { 
	                 
						return StudentRespotry.findById(id).get();
					
					 
	         } 
	  
	       
	         
	 }
	


