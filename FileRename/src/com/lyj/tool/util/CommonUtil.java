package com.lyj.tool.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class CommonUtil {
	
	public static Scanner scanner = new Scanner(System.in);

	public static String getPath() {

		System.out.println("请输入路径（按回车结束）：");

		String path = scanner.next();

		if (path == "") {
			return "";
		}

		return path;
	}
	
	public static String menu(){
		System.out.println("请选择改名模式（按回车结束）：1.加前缀    2.去前缀");
		String mode = scanner.next();
		if(!mode.equals("1") && !mode.equals("2")){
			System.out.println("输入错误！程序即将退出……");
			System.exit(0);
		}
		return mode;
	}
	
	public static String getString() throws IOException{
		System.out.println("请输入前缀（按回车结束）：");
		InputStreamReader reader = new InputStreamReader(System.in, "GB2312");
		
		BufferedReader breader = new BufferedReader(reader);
		
		String temp = breader.readLine();
		String subname = "";
		try {
			subname = new String(temp.getBytes(),"GB2312");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(subname == ""){
			System.out.println("输入错误！程序即将退出……");
			System.exit(0);
		}
		return subname;
	}
}
