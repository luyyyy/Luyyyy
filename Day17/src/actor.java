public class actor {
    private String it;

    public actor() {
    }

    public actor(String it) {
        this.it = it;
    }

    /**
     * 获取
     * @return it
     */
    public String getIt() {
        return it;
    }

    /**
     * 设置
     * @param it
     */
    public void setIt(String it) {
        this.it = it;
    }

    public String toString() {
        return "actor{it = " + it + "}";
    }
}
