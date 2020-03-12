/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program2;

/**
 *
 * @author Jagannath
 */
public class StringIterator implements CollectionInterface{
    String strings[];
    int pos;
    StringIterator(String[] strings) {
        this.strings = strings;
        this.pos = 0;
    }

    public MyIterator iterator() {
        return new MyIterator(strings);
    }
/*        @Override
    public String first() {
        return strings[0]; 
    }

    @Override
    public String next() {
        return strings[pos++];
    }

    @Override
    public String currentItem() {
        return strings[pos];
    }

    @Override
    public boolean IsDone() {
        if(pos >= strings.length){
            return true; 
        }
        else{
            return false;
        }
    }

 */   
}
