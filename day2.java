/*day-2 of 30 days coding
question:missing number
level :easy*/
class Solution {
    public int missingNumber(int[] nums) {
  
      int n=nums.length;
        int sum=(n*(n+1))/2;
        int s2=0;
        for(int i=0;i<n;i++)
        {
            s2=s2+nums[i];
        }
        return (sum-s2);
    }
}
//question:first unique character 
//level:easy
class Solution {
    public int firstUniqChar(String s) {
        int c[]=new int[26];
        for(char cc:s.toCharArray()){
            c[cc - 'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(c[s.charAt(i)- 'a']==1){
                return i;
            }
            
        }
return -1;
    }
}
//question:contains duplicate
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seenNumbers = new HashSet<>();

        for (int num : nums) {
            if (seenNumbers.contains(num)) {
                return true;
            }

            seenNumbers.add(num);
        }

        return false;
    }
}
