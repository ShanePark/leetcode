class Solution {
    public boolean halvesAreAlike(String s) {
        int cnt = 0;
        char[] arr = new char[]{'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < s.length() / 2; i++) {
            if (Arrays.binarySearch(arr, s.charAt(i)) >= 0)
                cnt++;
        }
        for (int i = s.length() / 2; i < s.length(); i++) {
            if (Arrays.binarySearch(arr, s.charAt(i)) >= 0)
                cnt--;
        }
        return cnt == 0;
    }
}