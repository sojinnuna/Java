package ch13.sec02.exam01;

public class Product<K, M> {
//    public T kind;
//    public T model;
//    kind, model을 제너릭으로 운영 / Getter, Setter 메서드를 직접 정의
//    모르겠슈 .. 해설 봄

    private K kind;
    private M model;

    public K getKind() { return this.kind; }
    public M getModel() { return this.model; }

    public void setKind(K kind){ this.kind = kind;}
    public void setModel(M model){ this.model = model; }
}
