package com.mvc.web.test;

import java.util.StringTokenizer;

public class TokenTest {

	public static void main(String[] args) {
		String str = "&,&,&";
		StringToken(str);

	}

	private static void StringToken(String str) {
		System.out.println("=String Token=");
		StringTokenizer st = new StringTokenizer(str, ",");
		for (int i = 0; st.hasMoreTokens(); i++) {
           System.out.println(i+" : " + st.nextToken());
		}
	}

}
