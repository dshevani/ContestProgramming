package contests.completed.codeforces;

import java.io.*;
import java.util.*;

public class A263
{	
	public void solve() throws IOException 
	{
		int n = nextInt();
		char[][] arr = new char[n][n];

		for (int x = 0; x < n; x++) {
			arr[x] = nextLine().toCharArray();
		}

		for (int x = 0; x < n; x++) {
			for (int y = 0; y < n; y++) {
				if (!checkCell(arr, x, y)) {
					System.out.println("NO");
					return;
				}
			}
		}
		System.out.println("YES");
	}
	
	public boolean checkCell(char[][] a, int x, int y) {
		int adj = 0;
		
		if (x > 0 && a[x - 1][y] == 'o') {
			adj++;
		}
		if (y > 0 && a[x][y - 1] == 'o') {
			adj++;
		}
		if (x < a.length - 1 && a[x + 1][y] == 'o') {
			adj++;
		}
		if (y < a.length - 1 && a[x][y + 1] == 'o') {
			adj++;
		}
		
		return (adj % 2 == 0);
	}

	public BufferedReader br;
	public StringTokenizer st;
	public PrintWriter out;

	public String nextToken() throws IOException {
		while(st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine());
		}

		return st.nextToken();
	}

	public String nextLine() throws IOException {
		return br.readLine();
	}

	public int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	public long nextLong() throws  IOException {
		return Long.parseLong(nextToken());
	}

	public double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}

	public void run() throws IOException 
	{	
		boolean oj = System.getProperty("ONLINE_JUDGE") != null;
		oj = true;
		br = new BufferedReader( new InputStreamReader( oj ? System.in : new FileInputStream("input.txt")));
		out = new PrintWriter( oj ? System.out : new FileOutputStream("output.txt"));
		solve();
		out.close();
	}

	public static void main(String[] args) throws IOException 
	{
		new A263().run();
	}
}
