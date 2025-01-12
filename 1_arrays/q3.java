class Solution {
    public int romanToInt(String s) {
        int I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000;
        int arr[] = new int[s.length() + 1];
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    arr[i] = I;
                    break;
                case 'V':
                    arr[i] = V;
                    break;
                case 'X':
                    arr[i] = X;
                    break;
                case 'L':
                    arr[i] = L;
                    break;
                case 'C':
                    arr[i] = C;
                    break;
                case 'D':
                    arr[i] = D;
                    break;
                case 'M':
                    arr[i] = M;
                    break;
                default:
                    break;
            }
        }
        arr[arr.length - 1] = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                result = result - arr[i];
            } else {
                result = result + arr[i];
            }
        }
        return result;
    }
}