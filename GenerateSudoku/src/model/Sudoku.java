package model;
import java.util.*;
public class Sudoku {
	
	private Map<String, Integer> map;

	public Sudoku(){
		map=new HashMap<String, Integer>();
		List<Integer> list=Sudoku.generateRow(9);
		for(int k=0; k<3; k++){
			for(int i=k; i<9; i+=3){
				for(int j=0; j<9; j++){
					String key=String.valueOf(i)+String.valueOf(j);
					map.put(key, list.get(j));
				}
				Sudoku.moveElements(list);
			}
		}
	}
	
	public static List<Integer> generateRow(int n){
		List<Integer> row=new ArrayList<Integer>();
		for(int i=1; i<=n; i++)
			row.add(i);
		Collections.shuffle(row);
		return row;
	}
	
	public static List<Integer> moveElements(List<Integer> list){
		int element=list.get(list.size()-1);
		for(int i=list.size()-1; i>0; i--){
			list.set(i, list.get(i-1));
		}
		list.set(0, element);
		return list;
	}

	public Map<String, Integer> getMap() {
		return map;
	}
	
	
}
