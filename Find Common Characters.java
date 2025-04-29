class Solution {
    public List<String> commonChars(String[] A) {
        int n = A.length;
        int[]result = new int[26];
        Arrays.fill(result,100);
        for(int i=0;i<n;i++){
            int[]curr=new int[26];
            for(int j=0;j<A[i].length();j++){
                curr[(int)(A[i].charAt(j) - 'a')]++;
            }
            for(int j=0;j<26;j++){
                result[j]=Math.min(result[j],curr[j]);
            }
        }
        List<String>ret = new LinkedList<String>();
        for(int i=0;i<26;i++){
            while(result[i]--!=0){
                ret.add(String.valueOf((char)(i+'a')));
            }
        }
        return ret;
    }
}
