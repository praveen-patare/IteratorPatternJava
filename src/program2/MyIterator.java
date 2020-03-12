/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program2;

/**
 *
 * @author Jagannath
 */
class MyIterator implements iIterator{

    Object list[];
    int pos;
    MyIterator(Object[] list) {
        this.list = list;
        this.pos = 0;
    }

    @Override
    public Object first() {
        return list[0]; 
    }

    @Override
    public Object next() {
        return list[pos++];
    }

    @Override
    public Object currentItem() {
        return list[pos];
    }

    @Override
    public boolean IsDone() {
        if(pos >= list.length){
            return true; 
        }
        else{
            return false;
        }
    }
    
    
}
