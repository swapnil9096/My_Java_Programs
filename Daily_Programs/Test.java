package Daily_Programs;

public class Test {

    public static int solution(int[] A, int N, int t, int R) {
       
    	int[] rotatedA = new int[N];
        System.arraycopy(A, 0, rotatedA, 0, N);

        // Perform rotations
        for (int i = 0; i < t; i++) {
            int temp = rotatedA[N - 1];
            System.arraycopy(rotatedA, 0, rotatedA, 1, N - 1);
            rotatedA[0] = temp;
        }

        // Calculate positive energy (Pe)
        int pe = 0;
        for (int i = R; i < N; i++) {
            pe += rotatedA[i];
        }

        // Calculate negative energy (Ne)
        int ne = 0;
        for (int i = 0; i < R; i++) {
            ne += rotatedA[i];
        }

        // Calculate resultant energy (Re)
        int re = Math.abs(pe - ne);

        return re;
    }





    public static void main(String[] args) {
        int N = 6;
        int[] A = {5, 1, 3, 2, 4, 8};
        int t = 3;
        int R = 2;

        int resultantEnergy = solution(A, N, t, R);
        System.out.println(resultantEnergy);
    }

    
    
    
    
    
    
}
