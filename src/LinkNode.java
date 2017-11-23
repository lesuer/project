/**
 * @author刘勗
 * @create2017-11-23-14:04
 */
public class LinkNode <E>{
    E data;
    LinkNode<E> lchild,rchild;
    LinkNode(E data,LinkNode<E> l,LinkNode<E> r){
        this.data =data;
        this.lchild = l;
        this.rchild = r;
    }
    LinkNode(E data){
        this.data =data;
        this.lchild = null;
        this.rchild = null;
    }


}
