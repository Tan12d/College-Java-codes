// Java Program to Print all possible safe
// sequences using banker's algorithm
import java.util.*;

public class GFG
{

	// total number of process
	static int P = 4;
	
	// total number of resources
	static int R = 3;
	
	// total safe-sequences
	static int total = 0;

	// function to check if process
	// can be allocated or not
	static boolean is_available(int process_id, int allocated[][],
					int max[][], int need[][], int available[])
	{

		boolean flag = true;

		// check if all the available resources
		// are less greater than need of process
		for (int i = 0; i < R; i++)
		{

			if (need[process_id][i] > available[i])
			{
				flag = false;
			}
		}

		return flag;
	}

	// Print all the safe-sequences
	static void safe_sequence(boolean marked[], int allocated[][], int max[][],
						int need[][], int available[], Vector<Integer> safe)
	{

		for (int i = 0; i < P; i++)
		{

			// check if it is not marked
			// already and can be allocated
			if (!marked[i] && is_available(i, allocated, max, need, available))
			{

				// mark the process
				marked[i] = true;

				// increase the available
				// by deallocating from process i
				for (int j = 0; j < R; j++)
				{
					available[j] += allocated[i][j];
				}

				safe.add(i);
				
				// find safe sequence by taking process i
				safe_sequence(marked, allocated, max, need, available, safe);
				safe.removeElementAt(safe.size() - 1);

				// unmark the process
				marked[i] = false;

				// decrease the available
				for (int j = 0; j < R; j++)
				{
					available[j] -= allocated[i][j];
				}
			}
		}

		// if a safe-sequence is found, display it
		if (safe.size() == P)
		{

			total++;
			for (int i = 0; i < P; i++)
			{

				System.out.print("P" + (safe.get(i) + 1));
				if (i != (P - 1))
				{
					System.out.print("--> ");
				}
			}

			System.out.println("");;
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		
		// allocated matrix of size P*R
		int allocated[][] = {{0, 1, 0},
		{2, 0, 0},
		{3, 0, 2},
		{2, 1, 1}};

		// max matrix of size P*R
		int max[][] = {{7, 5, 3},
		{3, 2, 2},
		{9, 0, 2},
		{2, 2, 2}};

		// Initial total resources
		int resources[] = {10, 5, 7};

		// available vector of size R
		int[] available = new int[R];

		for (int i = 0; i < R; i++)
		{

			int sum = 0;
			for (int j = 0; j < P; j++)
			{
				sum += allocated[j][i];
			}

			available[i] = resources[i] - sum;
		}

		// safe vector for displaying a safe-sequence
		Vector<Integer> safe = new Vector<Integer>();

		// marked of size P for marking allocated process
		boolean[] marked = new boolean[P];

		// need matrix of size P*R
		int[][] need = new int[P][R];
		for (int i = 0; i < P; i++)
		{
			for (int j = 0; j < R; j++)
			{
				need[i][j] = max[i][j] - allocated[i][j];
			}
		}

		System.out.println("Safe sequences are:");
		safe_sequence(marked, allocated, max, need, available, safe);

		System.out.println("\nThere are total " + total + " safe-sequences");
	}
}

