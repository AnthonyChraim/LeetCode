//You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  
//Each character in S is a type of stone you have.  
//You want to know how many of the stones you have are also jewels.
//
//The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, 
//so "a" is considered a different type of stone from "A".


public class jewelsAndStones {

	public static void main(String[] args) {
		
		String J = "aA";
		String S = "aAAbbbb";
		

	}

	public int numStones(String J, String S) {
		
		if (J == null || S == null || J.length() == 0 || S.length() == 0)
            return 0;
		
		int total = 0;
		
		
		for(int i = 0; i < J.length(); i++) {
			for(int j = 0; j < S.length(); j++) {
				if(J.charAt(i) == S.charAt(j))
					total++;
			}
		}
		
		return total;
	}
	
	public int numJewelsInStones(String J, String S) {
        // Corner cases.
        if (J == null || S == null || J.length() == 0 || S.length() == 0)
            return 0;
        
        // Map char to its frequency in S.
        int[] charToFreq = new int[256]; 
        for (char ch : S.toCharArray()) {	//converts string to char array
            charToFreq[ch]++;
        }
        
        int numJewels = 0; // Number of jewels among stones.
        for (char ch : J.toCharArray()) {
            if (charToFreq[ch] > 0) {
                numJewels += charToFreq[ch];
            }
        }
        
        return numJewels;
    }

}
