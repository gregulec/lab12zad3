
package lab12zad3;

public class Counter{
 protected long count = 0;
    
    public void add(long value) {
        this.count = this.count + value;
    }
    
    public long getCount() {
        return count;
    }
}
