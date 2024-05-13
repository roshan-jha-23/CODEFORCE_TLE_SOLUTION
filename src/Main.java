import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int[] rb = new int[n]; // smaller element in right
        Stack<Integer> st = new Stack<>();
        st.push(n - 1);
        rb[n - 1] = n;
        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                rb[i] = n;
            } else {
                rb[i] = st.peek();
            }
            st.push(i);
        }
        int[] lb = new int[n]; // next smaller element on right
        st.clear();
        st.push(0);
        lb[0] = -1;
        for (int i = 1; i < n; i++) {
            while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                lb[i] = -1;
            } else {
                lb[i] = st.peek();
            }
            st.push(i);
        }
        int maxi = 0;
        for(int i=0;i<n;i++){
            System.out.println("lb["+i+"] = "+lb[i]+" , rb["+i+"] = "+rb[i]);
            int width=rb[i]-lb[i]-1;
            System.out.println("Width for index "+i+": "+width);
            int area=arr[i]*width;
            maxi=Math.max(area,maxi);
        }
        return maxi;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1,1};
        int largestArea = solution.largestRectangleArea(arr);
        System.out.println("Largest rectangle area: " + largestArea);
    }
}
