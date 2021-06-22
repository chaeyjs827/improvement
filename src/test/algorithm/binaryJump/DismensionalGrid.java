package test.algorithm.binaryJump;

import java.util.ArrayList;
import java.util.List;

public class DismensionalGrid {

	public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("18 29");
        list.add("32 17");
        list.add("34 9");
        list.add("38 15");
        list.add("36 22");
        list.add("7 14");
        list.add("5 100");
        System.out.println(countMax(list));
	}
	
	public static long countMax(List<String> upRight) {
        long minRow = Long.MAX_VALUE;
        long minCol = Long.MAX_VALUE;
        for (String str: upRight) {
            long row = Long.parseLong(str.split(" ")[0]);
            long col = Long.parseLong(str.split(" ")[1]);
            minRow = (minRow <= row) ? minRow : row;
            minCol = (minCol <= col) ? minCol : col;
        }
        return minRow * minCol;
		/*
		long returnMax = 0l;

		int maxR = 0;
		int maxC = 0;
		
		
		int upRightSize = upRight.size();
//		int upRightSize = Integer.parseInt(upRight.get(0));
//		upRight.remove(0);
		
		
		int rArr[] = new int[upRightSize];
		int cArr[] = new int[upRightSize];
		
		for(int i=0; i<upRightSize; i++) {
			String str = upRight.get(i);
			String[] strArray = str.split(" ");
			int r = Integer.parseInt(strArray[0]);
			int c = Integer.parseInt(strArray[1]);

			rArr[i] = r;
			cArr[i] = c;

			if(maxR < r)  maxR = r;
			if(maxC < c)	maxC = c;
		}
		
		long[][] grid = new long[maxR][maxC];

		for(int h = 0; h<upRightSize; h++) {
			for(int i=0; i<rArr[h]; i++) {
				for(int j=0; j<cArr[h]; j++) {
					grid[i][j]++;
					if(returnMax < grid[i][j]) {
						returnMax = grid[i][j];
					}
				}
			}
		}
		
		return returnMax;
		*/
	}

}
