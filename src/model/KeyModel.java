package model;

public class KeyModel {
    private String StringKey;
    private int IntKey;
    
    public KeyModel(String stringKey, int intKey) {
        this.StringKey = stringKey;
        this.IntKey = intKey;
    }

    public KeyModel() {
    }

    public String getStringKey() {
        return StringKey;
    }

    public void setStringKey(String stringKey) {
        StringKey = stringKey;
    }

    public int getIntKey() {
        return IntKey;
    }

    public void setIntKey(int intKey) {
        IntKey = intKey;
    }

    public String toString() {
        return StringKey + " " + IntKey;
    }


}
