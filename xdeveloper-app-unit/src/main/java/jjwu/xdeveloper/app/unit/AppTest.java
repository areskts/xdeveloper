package jjwu.xdeveloper.app.unit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class AppTest {

	public static void main(String[] args) {
		testList();
		
	}

	public static void testList() {
		String[] strs = { "111", "222", "333" };
		List<String> list1 = new CopyOnWriteArrayList<String>(Arrays.asList(strs));
		List<String> list2 = new ArrayList<String>();
		Iterator<String> itor1 = list1.iterator(); // 写前建迭代器
		Iterator<String> itor2 = list2.iterator(); // 写前建迭代器
		list1.add("New");
		list2.add("New");

		try {
			printAll(itor1); // 迭代无误，输入111,222,333
		} catch (ConcurrentModificationException e) {
			System.err.println("Shouldn't get here1");
		}
		try {
			printAll(itor2); // 迭代过程中在itor.next()处抛出异常
		} catch (ConcurrentModificationException e) {
			e.printStackTrace();
		}
	}
	
	private static void printAll(Iterator<String> itor) {
		while (itor.hasNext()) {
			System.out.println(itor.next());
		}
	}

}
