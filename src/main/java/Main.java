import java.util.*;
import java.io.*;

public class Main {
    public static FastReader cin;
    public static PrintWriter out;
    public static int INF = 0x3f3f3f3f;
    public static int MOD = (int)(1e9 + 7);
    public static void main(String[] args) throws Exception {
        out = new PrintWriter(new BufferedOutputStream(System.out));
        cin = new FastReader();
        int ttt = cin.nextInt();
        label:for(int qqq = 0; qqq < ttt; qqq++) {

        }
        out.close();
    }
    public static void swap(char[] arr, int x, int y) {
        char temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static long lcm(long a,long b ){
        long ans = a * b / gcd(a,b);
        return ans;
    }

    public static long gcd(long a, long b){
        if (b == 0) {
            return a;
        }
        else {
            return gcd(b,a % b);
        }
    }

    /**
     * 矩阵快速幂
     * @param matrix 矩阵
     * @param pow 幂
     * @return
     */
    public static int[][] fastPow(int[][] matrix, int pow) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] res = new int[n][m];
        int[][] temp = matrix;
        for (int i = 0; i < n; i++) {
            res[i][i] = 1;
        }
        for (; pow != 0; pow >>= 1) {
            if ((pow & 1) != 0) {
                res = matrixMul(res, temp);
            }
            temp = matrixMul(temp, temp);
        }
        return res;
    }

    /**
     * 矩阵乘法
     * @param a 矩阵1
     * @param b 矩阵2
     * @return
     */
    public static int[][] matrixMul(int[][] a, int[][] b) {
        int n = a.length;
        int m = b[0].length;
        int[][] res = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int now = 0;
                for (int k = 0; k < a[0].length; k++) {
                    now += a[i][k] * b[k][j];
                }
                res[i][j] = now;
            }
        }
        return res;
    }

    public class Matrix{
        // arr[行][列]
        int[][] arr;
        public Matrix(int[][] arr) {
            this.arr = arr;
        }

        public int[][] getArr() {
            return arr;
        }

        public void setD(int[][] arr) {
            this.arr = arr;
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer str;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (str == null || !str.hasMoreElements()) {
                try {
                    str = new StringTokenizer(br.readLine());
                } catch (IOException lastMonthOfVacation) {
                    lastMonthOfVacation.printStackTrace();
                }
            }
            return str.nextToken();
        }

        int nextInt() {
            return  Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException lastMonthOfVacation) {
                lastMonthOfVacation.printStackTrace();
            }
            return str;
        }
    }
}


