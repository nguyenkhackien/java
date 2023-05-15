import java.io.FileNotFoundException;
import java.io.IOException;

public class Week8Task2 {

    /**
     * NullPointerException.
     */
    public void nullPointerEx() {
        throw new NullPointerException();
    }


    /**
     * ArithmeticException.
     */
    public void arithmeticEx() {
        throw new ArithmeticException();
    }

    /**
     * ArrayIndexOutOfBoundsException.
     */
    public void arrayIndexOutOfBoundsEx() {
        throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * FileNotFoundException.
     */
    public void fileNotFoundEx() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    /**
     * IOException.
     */
    public void ioEx() throws IOException {
        throw new IOException();
    }

    /**
     * NullPointerException.
     *
     * @return String
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
        return "Không có lỗi";
    }

    /**
     * ArrayIndexOutOfBoundsException.
     *
     * @return String
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "Không có lỗi";
    }

    /**
     *  ArithmeticException.
     *
     * @return String
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
        return "Không có lỗi";
    }

    /**
     * FileNotFoundException.
     *
     * @return String
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
        return "Không có lỗi";
    }

    /**
     * IOException.
     *
     * @return String
     */
    public String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }
}
