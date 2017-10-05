package model;

import java.util.*;

public class Sudoku {

	private Map<String, Integer> map;

	public Sudoku() {
		map = new HashMap<String, Integer>();
		setMap();
	}

	public void setMap() {
		List<Integer> list = Sudoku.getSudokuRow();

		for (int k = 0; k < 3; k++) {
			for (int i = k; i < 9; i += 3) {
				for (int j = 0; j < 9; j++) {
					map.put(("" + i + j), list.get(j));
				}
				Sudoku.moveElements(list);
			}
		}
	}
	
	public static List<Integer> getSudokuRow() {
		List<Integer> sudokuRow = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		Collections.shuffle(sudokuRow);

		return sudokuRow;
	}

	public static List<Integer> moveElements(List<Integer> list) {
		list.add(0, list.get(8));
		list.remove(9);

		return list;
	}

	public Map<String, Integer> getMap() {
		return map;
	}

}
