class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int p = 0;
        int q = s.length() - 1;
        while (p < q) {
            if ((s.charAt(p) == 'A' || s.charAt(p) == 'E' || s.charAt(p) == 'I' || s.charAt(p) == 'O'
                    || s.charAt(p) == 'U' || s.charAt(p) == 'a' || s.charAt(p) == 'e' || s.charAt(p) == 'i'
                    || s.charAt(p) == 'o' || s.charAt(p) == 'u')
                    && (s.charAt(q) == 'A' || s.charAt(q) == 'E'
                            || s.charAt(q) == 'I' || s.charAt(q) == 'O' || s.charAt(q) == 'U' || s.charAt(q) == 'a'
                            || s.charAt(q) == 'e' || s.charAt(q) == 'i' || s.charAt(q) == 'o' || s.charAt(q) == 'u')) {
                char temp = chars[p];
                chars[p] = chars[q];
                chars[q] = temp;
                p++;
                q--;
            }
            while (p < q &&!(s.charAt(p) == 'A' || s.charAt(p) == 'E' || s.charAt(p) == 'I' || s.charAt(p) == 'O'
                    || s.charAt(p) == 'U' || s.charAt(p) == 'a' || s.charAt(p) == 'e' || s.charAt(p) == 'i'
                    || s.charAt(p) == 'o' || s.charAt(p) == 'u')) {
                p++;
            }
            while (p < q &&!(s.charAt(q) == 'A' || s.charAt(q) == 'E' || s.charAt(q) == 'I' || s.charAt(q) == 'O'
                    || s.charAt(q) == 'U' || s.charAt(q) == 'a' || s.charAt(q) == 'e' || s.charAt(q) == 'i'
                    || s.charAt(q) == 'o' || s.charAt(q) == 'u')) {
                q--;
            }

        }
        return new String(chars);
    }
}