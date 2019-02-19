import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {
        System.out.println("Parentheses Match");
        System.out.println("()(()) Match: "+ PMatch("()(())"));
        System.out.println("()(()) Match: "+ PMatch("()(())"));
        System.out.println("()(()) Match: "+ PMatch("()(()"));
        System.out.println("{}{}{} Match: "+ PMatch("{}{}{}"));
        System.out.println("{}(){} Match: "+ PMatch("{}(){(}"));

    }

    private static boolean PMatch(String input){
        ArrayDeque<String> stack = new ArrayDeque<>();
        for (char i = 0; i < input.length(); i++) {
            String temp = String.valueOf(input.toCharArray()[i]);
            switch (temp){
                case "(":{
                    stack.push(temp);
                    break;
                }
                case "{":{
                    stack.push(temp);
                    break;
                }
                case "[":{
                    stack.push(temp);
                    break;
                }
                case ")":{
                    if(stack.peekFirst().equals("("))
                    {
                        stack.pop();
                    }
                    break;
                }
                case "}":{
                    if(stack.peekFirst().equals("{"))
                    {
                        stack.pop();

                    }
                    break;
                }
                case "]":{
                    if(stack.peekFirst().equals("["))
                    {
                        stack.pop();

                    }
                    break;
                }
                default:{

                }
            }
        }
        return stack.isEmpty();
    }
}
