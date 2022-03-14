import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;



public class HSR_1026 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N;
		StringTokenizer	st;
		int [] A,B;
		int sum = 0;
		N = Integer.parseInt(br.readLine());
		
		A = new int[N];
		B = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		Arrays.sort(B);
		
		for (int i = 0; i < N; i++) {
			sum += A[i] * B[N -1 -i];
		}
		
		System.out.println(sum);
	}
}
