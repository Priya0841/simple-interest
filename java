class Solution {
    double simpleInterest(int P, int R, int T) {
        
         return (P * R * T) / 100.0;
    }
}
Explanation:

We calculate the simple interest using the formula (P * T * R)/100.0
​where P, R, and T are the input parameters.
To ensure that the division results in a floating-point value, we divide by 100.0.
