package io.github.dunwu.javacore.enumeration;

import java.util.EnumSet;

/**
 * @author Zhang Peng
 * @since 2019-03-19
 */
public class EnumSetDemo {

	public static void main(String[] args) {
		System.out.println("EnumSet展示");
		EnumSet<ErrorCodeEn> errSet = EnumSet.allOf(ErrorCodeEn.class);
		for (ErrorCodeEn e : errSet) {
			System.out.println(e.name() + " : " + e.ordinal());
		}
	}

}
