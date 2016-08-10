/**
 * �Í����E���������s���T���v��
 */
public class SampleMain {
    public static void main(String[] args) {
        if(args.length != 3) {
            System.out.print("�������s���ł�");
            System.out.print(CommonUtill.getNewlineCode());
            System.out.print("�Ǎ��t�@�C���p�X�Əo�̓t�@�C���p�X���w�肵�Ă�������");
            System.out.print(CommonUtill.getNewlineCode());
            System.out.print(CommonUtill.getNewlineCode());
            System.out.print("�������F1(������)or2(�Í���)");
            System.out.print(CommonUtill.getNewlineCode());
            System.out.print("�������F�Ǎ��t�@�C���p�X");
            System.out.print(CommonUtill.getNewlineCode());
            System.out.print("��O�����F�o�̓t�@�C���p�X");
            return;
        } else {
            String inputStr = TextfileRead.getFileContens(args[1]);
            if (!args[0].equals("1") && !args[0].equals("2")) {
                System.out.print("�������F1(������)or2(�Í���)���w�肵�Ă�������");
            } else if(inputStr == null) {
                System.out.print("�t�@�C����ǂݍ��ݏo���܂���ł���");
                System.out.print(CommonUtill.getNewlineCode());
                System.out.print("�������A�܂��̓t�@�C�����m�F���Ă�������");
            } else if (inputStr.equals("")) {
                System.out.print("�t�@�C���̒��g����ł���");
            } else {
                //ConvertR2K crk = new ConvertR2K(inputStr);
                if (args[0].equals("1")) {
                    String decryptStr = Decrypt.getDecryptString(inputStr);
                    boolean bRet = TextfileWrite.createText(args[2],decryptStr);
                    if(bRet) {
                        System.out.print("�t�@�C���o�͂ɐ������܂���");
                    } else {
                        System.out.print("�t�@�C���o�͂Ɏ��s���܂���");
                        System.out.print(CommonUtill.getNewlineCode());
                        System.out.print("�o�̓t�@�C���p�X���m�F���Ă�������");
                    }
                } else if (args[0].equals("2")) {
                    String encryptStr = Encrypt.getEncryptString(inputStr);
                    boolean bRet = TextfileWrite.createText(args[2],encryptStr);
                    if(bRet) {
                        System.out.print("�t�@�C���o�͂ɐ������܂���");
                    } else {
                        System.out.print("�t�@�C���o�͂Ɏ��s���܂���");
                        System.out.print(CommonUtill.getNewlineCode());
                        System.out.print("�o�̓t�@�C���p�X���m�F���Ă�������");
                    }
                }
            }
        }
    }
}
