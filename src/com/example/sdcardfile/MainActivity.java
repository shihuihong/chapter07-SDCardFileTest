 package com.example.sdcardfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;

import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {


	protected void write(String cotent) {
		try {
			if(Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)){
				File sdCarDir=Environment.getExternalStorageDirectory();
				int fileName;
				File sdCardDir;
				File destFile=new   File(sdCardDir.getCanonicalPath()
						+File.separator+fileName);
				RandomAccessFile raf=new RandomAccessFile(destFile,"rw");
				raf.seek(destFile.length());
				String content;
				raf.write(content.getBytes());
				raf.close();
				
			}
				
			}catch(Exception e){
				e.printStackTrace();
			}
				
			}
	public String read(){
		StringBuilder sbBuilder=new StringBuilder("");
		try{
			if(Environment.getExternalStorageState().
					equals(Environment.MEDIA_MOUNTED)){
				File sdCard=Environment.getDownloadCacheDirectory();
			   File destFile=new Flie(sdCard.getCanonicalPath()
					   +File.separator+fileName);
			   FileInputStream fis=new FileInputStream(destFile);
			   byte[]buffer=new byte[64];
			   int hasRead;
			   while((hasRead=fis.read(buffer))!=-1){
				   sbBuilder.append(new String(buffer,0,hasRead));
			   }
			   
			   return sbBuilder.toString();
			   
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	return null;
}
		
