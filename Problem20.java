import java.util.Stack;

/**
 * Created by user on 19.03.2017.
 */
public class Problem20 {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        if (s.equals("")) return true;
        for (int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case '(':case '{':case '[':
                    st.push(s.charAt(i));
                    break;
                case ')':
                    if(st.empty()){
                        return false;
                    }
                    else {
                        if(st.pop()!='('){
                            return false;
                        }
                    }
                    break;
                case ']':
                    if(st.empty()){
                        return false;
                    }
                    else {
                        if(st.pop()!='['){
                            return false;
                        }
                    }
                    break;
                case '}':
                    if(st.empty()){
                        return false;
                    }
                    else {
                        if(st.pop()!='{'){
                            return false;
                        }
                    }
                    break;
                default:
                    return false;

            }
        }
        return st.empty();
    }
}
