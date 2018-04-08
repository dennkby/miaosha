package miaosha.result;

import com.sun.org.apache.bcel.internal.classfile.Code;

import javax.validation.constraints.Null;

/**
 * Created by Tony on 2018/4/8.
 */
public class Result<T> {
    private int code;
    private String msg;

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }

    public T getData() {
        return data;
    }

    private T data;
    public static <T> Result<T> success(T data){
        return new  Result<T>(data);
    }

    public static <T> Result<T> error(CodeMsg codeMsg){
        return new Result<T>(codeMsg);
    }
    private Result(T data) {
        this.code = 0;
        this.msg = "success";
        this.data = data;
    }

    private Result(CodeMsg codeMsg){
        if(codeMsg == null){
            return;
        }
        this.code = codeMsg.getCode();
        this.msg = codeMsg.getMsg();
    }
}
