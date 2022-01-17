import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class Activity6_Trees_Isidro extends JFrame{
    
        JTree tree;
    
    public Activity6_Trees_Isidro() {
        
        DefaultMutableTreeNode Henry = new DefaultMutableTreeNode("Henry Allen");
        DefaultMutableTreeNode Son1 = new DefaultMutableTreeNode("Barry Allen");
        DefaultMutableTreeNode Son2 = new DefaultMutableTreeNode("Jay Allen");
        DefaultMutableTreeNode Nora = new DefaultMutableTreeNode("Nora Allen");
        DefaultMutableTreeNode Oliver = new DefaultMutableTreeNode("Oliver Queen");
        DefaultMutableTreeNode Thea = new DefaultMutableTreeNode("Thea Queen");
        DefaultMutableTreeNode Eobard = new DefaultMutableTreeNode("Eobard Allen");
        DefaultMutableTreeNode Ray = new DefaultMutableTreeNode("Ray Allen");
        DefaultMutableTreeNode Cisco = new DefaultMutableTreeNode("Cisco Allen");
        DefaultMutableTreeNode Bruce = new DefaultMutableTreeNode("Bruce Allen");
        DefaultMutableTreeNode Joe = new DefaultMutableTreeNode("Joe Allen");
        DefaultMutableTreeNode Wally = new DefaultMutableTreeNode ("Wally Allen");
        DefaultMutableTreeNode Clark = new DefaultMutableTreeNode("Clark Allen");
        DefaultMutableTreeNode Snow = new DefaultMutableTreeNode("Snow Allen");
        DefaultMutableTreeNode Flakes = new DefaultMutableTreeNode("Snow Allen");

        Henry.add(Son1);
        Henry.add(Son2);

        Son1.add(Nora);
        Son1.add(Eobard);
        Nora.add(Oliver);
        Nora.add(Thea);

        Eobard.add(Ray);
        Eobard.add(Cisco);

        Son2.add(Bruce);
        Son2.add(Clark);
        Bruce.add(Joe);
        Bruce.add(Wally);
        
        Clark.add(Snow);
        Clark.add(Flakes);

        tree = new JTree(Henry);
        add(tree);

        this.add(tree);
        this.setTitle("The Family Tree");
        this.setSize(300, 400);
        this.setResizable(true);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    public static void main(String[]args){
        
        new Activity6_Trees_Isidro();
        
    }
}