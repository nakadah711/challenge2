/**
 * 暗号化・複合化を行うサンプル
 */
public class SampleMain {
    public static void main(String[] args) {
        if(args.length != 3) {
            System.out.print("引数が不正です");
            System.out.print(CommonUtill.getNewlineCode());
            System.out.print("読込ファイルパスと出力ファイルパスを指定してください");
            System.out.print(CommonUtill.getNewlineCode());
            System.out.print(CommonUtill.getNewlineCode());
            System.out.print("第一引数：1(複合化)or2(暗号化)");
            System.out.print(CommonUtill.getNewlineCode());
            System.out.print("第二引数：読込ファイルパス");
            System.out.print(CommonUtill.getNewlineCode());
            System.out.print("第三引数：出力ファイルパス");
            return;
        } else {
            String inputStr = TextfileRead.getFileContens(args[1]);
            if (!args[0].equals("1") && !args[0].equals("2")) {
                System.out.print("第一引数：1(複合化)or2(暗号化)を指定してください");
            } else if(inputStr == null) {
                System.out.print("ファイルを読み込み出来ませんでした");
                System.out.print(CommonUtill.getNewlineCode());
                System.out.print("第二引数、またはファイルを確認してください");
            } else if (inputStr.equals("")) {
                System.out.print("ファイルの中身が空でした");
            } else {
                //ConvertR2K crk = new ConvertR2K(inputStr);
                if (args[0].equals("1")) {
                    String decryptStr = Decrypt.getDecryptString(inputStr);
                    boolean bRet = TextfileWrite.createText(args[2],decryptStr);
                    if(bRet) {
                        System.out.print("ファイル出力に成功しました");
                    } else {
                        System.out.print("ファイル出力に失敗しました");
                        System.out.print(CommonUtill.getNewlineCode());
                        System.out.print("出力ファイルパスを確認してください");
                    }
                } else if (args[0].equals("2")) {
                    String encryptStr = Encrypt.getEncryptString(inputStr);
                    boolean bRet = TextfileWrite.createText(args[2],encryptStr);
                    if(bRet) {
                        System.out.print("ファイル出力に成功しました");
                    } else {
                        System.out.print("ファイル出力に失敗しました");
                        System.out.print(CommonUtill.getNewlineCode());
                        System.out.print("出力ファイルパスを確認してください");
                    }
                }
            }
        }
    }
}
