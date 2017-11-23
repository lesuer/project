/**
 * @author刘勗
 * @create2017-11-23-14:07
 */

public class BiTreeOrderTest {

    public static void main(String[] args) {
        LinkBiTree<Integer> tree = new LinkBiTree<Integer>();
        createBiTree(tree);//
        //先序遍历
        System.out.println("该二叉树的先序遍历序列为：");
        tree.traverse(1);
        System.out.println();

        //先序遍历
        System.out.println("该二叉树的中序遍历序列为：");
        tree.traverse(2);
        System.out.println();

        //先序遍历
        System.out.println("该二叉树的后序遍历序列为：");
        tree.traverse(3);
        System.out.println();

    }

    public static void createBiTree(LinkBiTree<Integer> tree){
        tree.create(1,null,null);//
        tree.insertL(tree.root,new LinkNode(2));
        tree.insertL(tree.root.lchild,new LinkNode(4));

        tree.insertR(tree.root.lchild.lchild,new LinkNode(9));
        tree.insertL(tree.root.lchild.lchild,new LinkNode(8));

        tree.insertR(tree.root.lchild,new LinkNode(5));
        tree.insertL(tree.root.lchild.rchild,new LinkNode(10));

        tree.insertR(tree.root,new LinkNode(3));
        tree.insertL(tree.root.rchild,new LinkNode(6));
        tree.insertR(tree.root.rchild,new LinkNode(7));




    }

}

