class Solution {
    public String addBinary(String a, String b) {
        int alen = a.length() - 1;
        int blen = b.length() - 1;
        int carry = 0;
        StringBuilder builder = new StringBuilder();

        while (alen >= 0 || blen >= 0 || carry != 0) {
            int bitA = (alen >= 0) ? a.charAt(alen) - '0' : 0;
            int bitB = (blen >= 0) ? b.charAt(blen) - '0' : 0;

            int sum = bitA + bitB + carry;
            builder.append(sum % 2); // Add the result bit (0 or 1)
            carry = sum / 2;        // Update carry

            alen--;
            blen--;
        }

        return builder.reverse().toString();
    }
}

// class Solution {
//     public String addBinary(String a, String b) {
//         int alen = a.length() - 1;
//         int blen = b.length() - 1;
//         int carry = 0;
//         StringBuilder builder = new StringBuilder();
//         while (alen >= 0 && blen >= 0) {
//             if (carry == 0) {
//                 if (a.charAt(alen) == '0' && b.charAt(blen) == '0') {
//                     builder.append("0");
//                 } else if (a.charAt(alen) == '0' && b.charAt(blen) == '1' || a.charAt(alen) == '1' && b.charAt(blen) == '0') {
//                     builder.append("1");
//                 } else if (a.charAt(alen) == '1' && b.charAt(blen) == '1') {
//                     builder.append("0");
//                 }
//             }
//             else{
//                 if (a.charAt(alen) == '0' && b.charAt(blen) == '0') {
//                     builder.append("1");
//                 } else if (a.charAt(alen) == '0' && b.charAt(blen) == '1' || a.charAt(alen) == '1' && b.charAt(blen) == '0') {
//                     builder.append("0");
//                     carry=1;
//                 } else if (a.charAt(alen) == '1' && b.charAt(blen) == '1') {
//                     builder.append("1");
//                     carry=1;
//                 }
//             }
//             alen--;
//             blen--;
//         }

//         String ans = builder.reverse().toString();
//         return ans;
//     }
// }