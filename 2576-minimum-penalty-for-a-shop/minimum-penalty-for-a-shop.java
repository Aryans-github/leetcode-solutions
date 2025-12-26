class Solution {
    public int bestClosingTime(String customers) {
        int penalty = 0;
        for (int i = 0; i < customers.length(); i++) {
            if (customers.charAt(i) == 'Y')
                penalty++;
        }
        int minPenalty = penalty, minPenaltyHour = 0;

        for (int j = 0; j < customers.length(); j++) {
            if (customers.charAt(j) == 'Y')
                penalty--;
            else if (customers.charAt(j) == 'N')
                penalty++;

            if (penalty < minPenalty) {
                minPenalty = penalty;
                minPenaltyHour = j+1;
            }
        }

        return minPenaltyHour;
    }
}