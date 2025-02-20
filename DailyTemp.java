import java.util.Stack;
public class DailyTemp {
    //TC = O(2n) SC=O(n)
    public int[] dailyTemperatures(int[] temperatures) {
        if(temperatures==null||temperatures.length==0)return new int[0];
        int[] result = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                int popped = st.pop();
                result[popped] = i-popped;
            }
            st.push(i);
        }
        return result;
    }
}
