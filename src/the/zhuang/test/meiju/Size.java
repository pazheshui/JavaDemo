package the.zhuang.test.meiju;

public enum Size {
    DA(1),
    ZHONG(2),
    XIAO(3);
    private Size(int i){
        this.val = i;
    }
    public int getVal(){
        return this.val;
    }
    private int val;
    public Size cunzai(int a){
        for (Size s: Size.values()){
            if (s.val == a){
                return s;
            }
        }
        return null;
    }
}
