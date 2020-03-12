/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program2;

/**
 *
 * @author Jagannath
 */
public class DoubleIteraor implements CollectionInterface{
    
    Double doubles[];
    int pos;
    DoubleIteraor(Double[] doubles) {
        this.doubles = doubles;
        this.pos = 0;
    }

    public MyIterator iterator() {
        return new MyIterator(doubles);
    }
    
/*    @Override
    public Double first() {
        return doubles[0]; 
    }

    @Override
    public Double next() {
        return doubles[pos++];
    }

    @Override
    public Double currentItem() {
        return doubles[pos];
    }

    @Override
    public boolean IsDone() {
        if(pos >= doubles.length){
            return true; 
        }
        else{
            return false;
        }
    }
*/
}
