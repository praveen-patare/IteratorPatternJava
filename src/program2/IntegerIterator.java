/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program2;

/**
 *
 * @author Jagannath
 */
public class IntegerIterator implements CollectionInterface{
    Integer integers[];
    int pos;
    IntegerIterator(Integer[] integers) {
        this.integers = integers;
        this.pos = 0;
    }

    public MyIterator iterator() {
        return new MyIterator(integers);
    }
    
/*        @Override
    public Integer first() {
        return integers[0]; 
    }

    @Override
    public Integer next() {
        return integers[pos++];
    }

    @Override
    public Integer currentItem() {
        return integers[pos];
    }

    @Override
    public boolean IsDone() {
        if(pos >= integers.length){
            return true; 
        }
        else{
            return false;
        }
    }
*/
}
