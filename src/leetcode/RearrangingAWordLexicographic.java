package leetcode;

/**
 * Rearranging a Word
 * Given a word, return the next alphabetically greater string in all permutations of that word.
 * If there is no greater permutation, return the string 'no answer' instead.
 *
 * Example:
 * word = 'baca'
 *
 * The string 'baca' has the following permutations in alphabetical order: 'aabc', 'aacb', 'abac', 'abca', 'acab',
 * 'acba', 'baac', 'baca', 'bcaa', 'caab', 'caba', and 'cbaa'.
 * The next alphabetically greater permutation of the original string is 'bcaa'.
 *
 * <a href="https://www.geeksforgeeks.org/lexicographically-next-permutation-in-cpp/">Lexicographically</a>
 *
 * Similarly, when we talk about lexicographic permutations,
 * we are referring to generating all possible arrangements of characters in a word in such a way that they
 * follow the order of the dictionary.
 */
public class RearrangingAWordLexicographic {

    public static String rearrangeword(String word) {
        char[] arr = word.toCharArray();

        // Find the first pair of adjacent characters in descending order from the right
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i < 0) {
            // No greater permutation is possible
            return "no answer";
        }

        // Find the rightmost character greater than the character at index i
        int j = arr.length - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }

        // Swap the characters at indices i and j
        swap(arr, i, j);

        // Reverse the substring starting from index i + 1 to get the next permutation
        reverse(arr, i + 1, arr.length - 1);

        return new String(arr);
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String word = "hefg";
        String nextPermutation = rearrangeword(word);
        System.out.println(nextPermutation);
    }
}