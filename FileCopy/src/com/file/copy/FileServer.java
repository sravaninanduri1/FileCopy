package com.file.copy;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ServerSocket so=null;
		Socket sr=null;
		FileInputStream fr=null;
		try{
        so=new ServerSocket(7777);
        sr=so.accept();
        fr=new FileInputStream("E:\\sr.txt");
        byte[] b=new byte[1002];
        fr.read(b,0,b.length);
        OutputStream os=sr.getOutputStream();
        os.write(b,0,b.length);
		}
        catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try {
				fr.close();
				sr.close();
				so.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
