
    /*
    Question 1: Knapsack with infinite number of items.
    Question 2: Knapsack without repetion of the items.
    Question 3: Least common subsequence if a given two sequence
    Question 4: Print all permutaion of a given string
    */





      /*Question 1:
      Knapsack Problem with repetition allowed, i.e there is an infinite number of items
      w= weight array, v= value array, tw =  weight capacity of knapsack. Aim is to maximize the
      total value in Knapsack.
      
      See a better solution in Dynamic Programming question section
      */
	
	public static int KnapsackWithRep(int[] w, int[] v, int tw) {
		int[] knapArray = new int[w.length];
		
		if (tw < minArray(w))
			return 0;
		else {
			for (int i = 0; i < w.length; ++i) {
				if (tw >= w[i])
					knapArray[i] = KnapsackWithRep(w, v, tw - w[i]) + v[i];
			}
		}
		return maxArray(knapArray);
	}
	
	public static int minArray(int[] ar) {
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < ar.length; ++i) {
			if (ar[i] < min)
			min = ar[i];
		}
		return min;
	}
	
	public static int maxArray(int[] ar) {
		int max = 0;

		for (int i = 0; i < ar.length; ++i) {
			if (max < ar[i])
			max = ar[i];
		}
		return max;
	}
	
      /*Question 2:
      Knapsack Problem with repetition, i.e there is only one item for each item.
      w= weight array, v= value array, tw =  weight capacity of knapsack. Aim is to maximize the
      total value in Knapsack.
      */
     
      /*Question 3:
      Least Common subsequence of a given two sequence. ex: Inputs: s1 = "peacefully", s2 = "ecology". Output= "ecly"
      */
     
     
     
     	public static String LCS(String s1, String s2) {
		int s1L = s1.length();
		int s2L = s2.length();
		if (s1.length() == 0 || s2.length() == 0)
			return "";

		if (s1.charAt(0) == s2.charAt(0))
			return s2.charAt(0) + LCS(s1.substring(1), s2.substring(1));
		else {
			String x = LCS(s1.substring(1), s2);
			String y = LCS(s1, s2.substring(1));
			return (x.length() > y.length()) ? x : y;

		}

	}

	/*Question 4;
	Print the all permutation of the given string. input = abc , output = abc acb bac bca cab cba
	*/
	
	public static void permutationPrinter(String str) {

		permutationPrinter(str, "");
	}

	public static void permutationPrinter(String str, String perm) {
		if (str.equals(""))
			System.out.print(perm + " ");
		else {
			for (int i = 0; i < str.length(); ++i) {
                //removing ith character from str and add it into perm string
				String strNew = str.substring(0, i) + str.substring(i + 1);
				String permNew = perm + str.charAt(i);
				permutationPrinter(strNew, permNew);

			}
		}

	}
	