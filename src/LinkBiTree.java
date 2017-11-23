/**
 * @author刘勗
 * @create2017-11-23-14:05
 */

public class LinkBiTree<E> implements BiTree<E> {
    LinkNode<E> root=null;

    @Override
    public void create(E val, LinkNode<E> l, LinkNode<E> r) {
        root = new LinkNode(val,l,r);

    }

    @Override
    public void insertL(LinkNode<E> node, LinkNode<E> p) {
        if(node!=null){
            node.lchild = p;
        }

    }

    @Override
    public void insertR(LinkNode<E> node, LinkNode<E> p) {
        if(node!=null){
            node.rchild = p;
        }

    }

    @Override
    public LinkNode<E> deleteL(LinkNode<E> p) {
        LinkNode<E> temp;
        if(p!=null){
            temp = p.lchild;
            p.lchild = null;
            return temp;
        }
        return null;
    }

    @Override
    public LinkNode<E> deleteR(LinkNode<E> p) {
        LinkNode<E> temp;
        if(p!=null){
            temp = p.rchild;
            p.rchild = null;
            return temp;
        }
        return null;
    }

    @Override
    public void traverse(int i) {//遍历二叉树 1、先序遍历 2、中序遍历 3、后序变量
        switch(i){
            case 1:preorder(this.root);break;
            case 2:inorder(this.root);break;
            case 3: postorder(this.root);break;
        }

    }
    //递归实现
    private void preorder(LinkNode<E> p){
        if(p==null)return;
        visit(p);
        preorder(p.lchild);
        preorder(p.rchild);
    }




    //1、中序遍历
    private void inorder(LinkNode<E> p){
        if(p==null)return;
        inorder(p.lchild);
        visit(p);
        inorder(p.rchild);
    }

    //1、后序遍历
    private void postorder(LinkNode<E> p){
        if(p==null)return;
        postorder(p.lchild);
        postorder(p.rchild);
        visit(p);
    }

    private void visit(LinkNode<E> p){
        if(p!=null)
            System.out.print(" "+p.data);
    }



}
