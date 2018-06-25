package util;

public class PageBean {

    private int firstResult;
    private int maxResult;
    private int totalCount;
    private int batch;
    private int lastResult;

    public PageBean(int firstResult, int maxResult, int totalCount) {
        this.firstResult = firstResult;
        this.maxResult = maxResult;
        this.totalCount = totalCount;
    }

    public int getFirstResult() {
        return firstResult;
    }

    public void setFirstResult(int firstResult) {
        this.firstResult = firstResult;
    }

    public int getMaxResult() {
        return maxResult;
    }

    public void setMaxResult(int maxResult) {
        this.maxResult = maxResult;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getBatch() {
        return getTotalCount() / getMaxResult();
    }

    public int getLastResult() {
        return getTotalCount() % getMaxResult();
    }

}
