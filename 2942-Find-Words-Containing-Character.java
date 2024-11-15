class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> output = new ArrayList<>();
		for( int  i=0 ; i< words.length ; i++) {
			int data = words[i].indexOf(x);
			if(data>=0) {
				output.add(i);
			}
		}
		return output;
    }
}