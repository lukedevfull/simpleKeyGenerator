package keyController;
import model.KeyModel;
public class Controller {
    public String keyEncoder(String stringKey, int intKey) {
        KeyModel key = new KeyModel(stringKey, intKey);

        key.toString();
        return key.toString();
    }
    
    public String keyFormatter(String stringKey, int intKey) {
        String key = keyEncoder(stringKey, intKey).toLowerCase().replaceAll(" ", "-");
        return key;
    }
}
