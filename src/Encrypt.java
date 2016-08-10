public class Encrypt {
    public static String getEncryptString(String inputStr) {
        char[] charArray = inputStr.toCharArray();
        String outputStr = "";
        for (int i=0; i<charArray.length; i++) {
            int code = charArray[i];
            code = code + 13;
            outputStr = outputStr + String.valueOf(Character.toChars(code));
        }
        return outputStr;
    }
}
