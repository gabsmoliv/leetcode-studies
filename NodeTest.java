import java.util.Objects;

public class NodeTest {

    public static void main(String[] args) {

    }

    static void preOrderTree(Node tree) {
        if (Objects.nonNull(tree.getValue())) {
            System.out.println("Current value " + tree.getValue());
        }

        if (Objects.nonNull(tree.getLeft())) {
            preOrderTree(tree.getLeft());
        }

        if (Objects.nonNull(tree.getRight())) {
            preOrderTree(tree.getRight());
        }
    }

    static void inOrderTree(Node tree) {
        if (Objects.isNull(tree)) {
            return;
        }

        inOrderTree(tree.getLeft());

        if (Objects.nonNull(tree.getValue())) {
            System.out.println("Current value " + tree.getValue());
        }

        inOrderTree(tree.getRight());
    }

    static void postOrder(Node tree) {
        if (Objects.nonNull(tree.getLeft())) {
            postOrder(tree.getLeft());
        }

        if (Objects.nonNull(tree.getRight())) {
            postOrder(tree.getRight());
        }

        if (Objects.nonNull(tree.getValue())) {
            System.out.println("Current value " + tree.getValue());
        }
    }

}