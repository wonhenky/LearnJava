package Collection.Generic;
/*
把泛型定义到类上
T就是一个参数，将来定义什么，这就是什么
 */
public class ObjectTool<T> {
    private T obj;
    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}

