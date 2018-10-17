package com.file.copy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class FileClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] b=new byte[1002];
		Socket sr=null;
		InputStream is=null;
		FileOutputStream fr=null;
		try{
		sr=new Socket("localhost",7777);
		is=sr.getInputStream();
		fr =new FileOutputStream("E:\\sravi.txt");
		is.read(b,0,b.length);
        fr.write(b,0,b.length);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try {
				fr.close();
				is.close();
				sr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
