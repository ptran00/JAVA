package Bai;

import java.util.ArrayList;

public class Bai64_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> list = new ArrayList<>();
		list.add("Tran Van Phong");
		list.add(0, "Le Thi Lien");
		
		System.out.println(list.isEmpty());
		System.out.println(list.size());
	   
		list.clear();
		System.out.println(list.size());
		
	}

}
