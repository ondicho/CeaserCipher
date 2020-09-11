public class Decode {
    private Encode Input;
    private Encode key;

    public Decode(Encode encryptedOutput, Encode encryptionKey){
        Input=encryptedOutput;
        key=encryptionKey;
    }
    public Encode getEncryptedOutput(){
        return Input;
    }

    public Encode getEncryptionKey(){
        return key;
    }

}
