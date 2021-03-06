package contests.completed.codeforces;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class A279 {
  
  public void solve() throws IOException {
    int n = nextInt();
    List<Integer> prog = new ArrayList<Integer>();
    List<Integer> math = new ArrayList<Integer>();
    List<Integer> pe = new ArrayList<Integer>();
    
    for (int x = 1; x <= n; x++) {
      int type = nextInt();
      switch (type) {
      case 1: prog.add(x); break;
      case 2: math.add(x); break;
      case 3: pe.add(x); break;
      }
    }
    
    int teams = Math.min(Math.min(prog.size(), math.size()), pe.size());
    System.out.println(teams);
    for (int x = 0; x < teams; x++) {
      System.out.println(prog.get(x) + " " + math.get(x) + " " + pe.get(x));
    }
  }

  public BufferedReader br;
  public StringTokenizer st;
  public PrintWriter out;

  public String nextToken() throws IOException {
    while (st == null || !st.hasMoreTokens()) {
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

  public long nextLong() throws IOException {
    return Long.parseLong(nextToken());
  }

  public double nextDouble() throws IOException {
    return Double.parseDouble(nextToken());
  }

  public void run() throws IOException {
    boolean oj = System.getProperty("ONLINE_JUDGE") != null;
    oj = true;
    br = new BufferedReader(
        new InputStreamReader(oj ? System.in : new FileInputStream("input.txt")));
    out = new PrintWriter(oj ? System.out : new FileOutputStream("output.txt"));
    solve();
    out.close();
  }

  public static void main(String[] args) throws IOException {
    new A279().run();
  }
}
