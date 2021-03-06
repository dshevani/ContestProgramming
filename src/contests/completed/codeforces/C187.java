package contests.completed.codeforces;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C187 {
  public void solve() throws IOException {
    int num = nextInt();
    long n = (long) (Math.log(num) / Math.log(4)) + 1;

    long[] arr = new long[num];
    for (int x = 0; x < num; x++)
      arr[x] = nextLong();

    Arrays.sort(arr);

    long beauty = 0;
    int index = 1;
    for (int x = 0; x < num; x++) {
      if (x == index) {
        index *= 4;
        n--;
      }
      beauty += arr[num - x - 1] * n;
    }

    out.println(beauty);
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

    // oj = true;

    br = new BufferedReader(
        new InputStreamReader(oj ? System.in : new FileInputStream("input.txt")));
    out = new PrintWriter(oj ? System.out : new FileOutputStream("output.txt"));

    solve();

    out.close();
  }

  public static void main(String[] args) throws IOException {
    new C187().run();
  }
}
