package cc.somkiat.basicunittesting;

class NameValidation {

    String[] nameErrors = new String[]{"Empty", "Null"};

    public int validate(String name) {
        return 1;
    }

    public boolean isEmpty(String name) {
        if(name.isEmpty()){
            return false;
        }
        return true;
    }

    public boolean isNull(String name) {
        if(name.isEmpty()){
            return false;
        }
        return true;
    }
}
