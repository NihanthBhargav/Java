package Strings;

public class reverseWords{
    static String reverseSentence(String str){
        String[] words = str.split("\\.");

        StringBuilder result = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--){
            if(!words[i].isEmpty()){
                if(result.length() > 0){
                    result.append(".");
                }
            }

            result.append(words[i]);
        }

        return result.toString();
    }
    public static void main(String[] args){
        String str = "I.like.this.program.very.much";
        System.out.println(reverseSentence(str));
    }
}