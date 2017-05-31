package test;

import java.util.Map;

import model.Sudoku;

public class Test {

	public static void main(String[] args) {
		Sudoku sudoku=new Sudoku();
		Map<String, Integer> map=sudoku.getMap();
		for(int i=0; i<9; i++)
			for(int j=0; j<9; j++)
				System.out.println(map.get(String.valueOf(i)+String.valueOf(j)));
	}

}
