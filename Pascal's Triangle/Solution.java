import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
    	ArrayList<ArrayList<Long>> ans = new ArrayList<>();

        for (int row = 1; row <= n; row++) {
            ArrayList<Long> tempLst = new ArrayList<>(); 
            for (int col = 1; col <= row; col++) {
                tempLst.add((long)nCr(row - 1, col - 1));
            }
            ans.add(tempLst);
        }
        return ans;
	}
	public static long nCr(int n, int r) {
        long res = 1;

        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
}
