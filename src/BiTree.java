public interface BiTree<E> {
    void create(E val, LinkNode <E>l, LinkNode <E> r);	//以val为根节点元素，l和r为左右子树构造二叉树
    void insertL(LinkNode <E> node, LinkNode <E> p);			//将元素插入p的左子树
    void insertR(LinkNode <E> node, LinkNode <E> p);			//将元素插入p的右子树
    LinkNode<E> deleteL(LinkNode <E> p) ;			//删除p的左子树
    LinkNode<E> deleteR(LinkNode <E> p);				//删除p的右子树

    void traverse( int i);			//按某种方式i遍历root二权树


}

