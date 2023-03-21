package baitaptugiai5;

public class main {

	public static void main(String[] args) {
		int n = 3; // NxN size of matrices
	    
	    // matrix A initialization
	    int[][] A = new int[n][n];
	    for (int i = 0; i < n; i++) {
	      for (int j = 0; j < n; j++) {
	        A[i][j] = i + j + 1;
	      }
	    }
	    
	    // matrix B initialization
	    int[][] B = new int[n][n];
	    for (int i = 0; i < n; i++) {
	      for (int j = 0; j < n; j++) {
	        B[i][j] = i + j + 2;
	      }
	    }
	    
	    // result matrix initialization
	    int[][] C = new int[n][n];
	    
	    // create and start NxN threads
	    Thread[][] threads = new Thread[n][n];
	    for (int i = 0; i < n; i++) {
	      for (int j = 0; j < n; j++) {
	        int row = i;
	        int col = j;
	        threads[i][j] = new Thread(() -> {
	          int sum = 0;
	          for (int k = 0; k < n; k++) {
	            sum += A[row][k] * B[k][col];
	          }
	          C[row][col] = sum;
	        });
	        threads[i][j].start();
	      }
	    }
	    
	    // wait for all threads to finish
	    try {
	      for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	          threads[i][j].join();
	        }
	      }
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	    
	    // print result matrix
	    for (int i = 0; i < n; i++) {
	      for (int j = 0; j < n; j++) {
	        System.out.print(C[i][j] + " ");
	      }
	      System.out.println();
	    }
	 }

}


