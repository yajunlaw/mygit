package com.lyj.tool.main;

import java.io.File;
import java.io.IOException;

import com.lyj.tool.util.CommonUtil;

public class Main {

	/**
	 * @author yajunlaw
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String path = CommonUtil.getPath();
		
		String mode = CommonUtil.menu();
		
		String subname = CommonUtil.getString();
		
		File filelist = new File(path);
		
		String namelist[] = filelist.list();
		
		for (String string : namelist) {
			File file = new File(path + "/" + string);
			if (mode.equals("1")){
				file.renameTo(new File(path + "/" + subname + string));
			}else if(mode.equals("2")){
				int index = subname.length();
				String name = string.substring(index,string.length());
				file.renameTo(new File(path + "/" + name));
			}
			
		}
		
	}

	
	
}
