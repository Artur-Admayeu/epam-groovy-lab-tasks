/**
Encrypt input string. Conditions:
- string is a space separated words
- you need to encrypt each word using following rules:
  * The first letter needs to be converted to its ASCII code
  * The second letter needs to be switched with the last letter
Example:
Task07.encryptThis("Hello") == "72olle"
Task07.encryptThis("hello world") == "104olle 119drlo"
*/

package groovylab

class Task07 {
    public static String encryptThis(String s) {
        if (s.length()==0) return "";
        List word = s.split(" ")
        def res = []
        for ( def lit in word ){
            if (lit.length() <= 2){
                if (lit.length() <= 1) { res << (int) lit[0] }
                else {res << (int) lit[0] + lit[1]}
            }
            else {     
                res << (int) lit[0] + lit[-1] + lit[2..-2] + lit[1]
            }
        }
        return res.join(" ")
    }
}
