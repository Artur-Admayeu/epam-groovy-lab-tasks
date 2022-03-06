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
    def res = []
    for (String slovo : s.split(" ")) {
        res << (int) slovo[0]  + slovo[-1] + slovo[2..-2]  + slovo[1]
    }
    return res.join(" ")
    }
}
