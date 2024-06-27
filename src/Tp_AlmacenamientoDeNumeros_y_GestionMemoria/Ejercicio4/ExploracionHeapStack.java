package Tp_AlmacenamientoDeNumeros_y_GestionMemoria.Ejercicio4;

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class ExploracionHeapStack {
    public static void main(String[] args) {
        // Crear un árbol binario simple
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Realizar una búsqueda en profundidad (DFS) recursiva
        dfs(root);
    }

    public static void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println("Visiting node with value: " + node.value);
        dfs(node.left);
        dfs(node.right);
    }
}
