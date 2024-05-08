package student_utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.app.core.Student;



public interface IOUtils 
{
//add a static method to store student details, in a bin file using Serialization//
	static void WriteDetails(Map<String, Student> students,String fileName) throws IOException
	{
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(fileName)))
		{
			out.writeObject(students);//serialization: conversion of object file/data into binary form//
		}//JVM:out.close--fos.close: closes the the file handler///
	}
	
	//add static method for restoring the student details, from a bin file using DeSerialization//
	
	@SuppressWarnings("unchecked")
	static Map<String, Student> readDetails(String fileName) throws IOException, ClassNotFoundException
	{
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(fileName)))
		{
			return(Map<String, Student>)in.readObject();
		}
	}
}
