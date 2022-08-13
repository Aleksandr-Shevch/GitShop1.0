package utils;

public class MyException extends Exception {


    public MyException(String str) {
        super(str);
    }

    public String getMessege() {

        return "English only! Try again: ";
    }
}
