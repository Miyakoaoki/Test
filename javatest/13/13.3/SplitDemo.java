//SplitDemo.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.table.*;
import javax.swing.event.*;
public class SplitDemo extends JFrame
{
    JSplitPane splitPane;     //����ָ����
    CardLayout tableCard=new CardLayout(); //������Ƭ����
    JPanel tablePane=new JPanel();         //�������
	TablePane tablePane0,tablePane1,tablePane2,tablePane3;//������������
	String[] header={"ѧ��","����","�Ա�","��������","�༶"};
   	Object[][] data1={
		{new Integer(1),"����","Ů","1988-8-1","�����1��"},
		{new Integer(2),"����","��","1987-10-13","�����1��"},
		{new Integer(3),"����","��","1988-3-5","�����1��"}};
		Object[][] data2={
		{new Integer(1),"������","Ů","1987-12-9","�����2��"},
		{new Integer(2),"��һ��","Ů","1988-6-23","�����2��"}};
		Object[][] data3={
		{new Integer(1),"����","��","1986-10-19","����1��"},
		{new Integer(2),"����","Ů","1987-9-23","����1��"}};
		
	SplitDemo()
	{
		//ʹ���Զ����������ഴ�������
		TreePane treePane=new TreePane();
		//ʹ���Զ���ı������ഴ��������
		tablePane0=new TablePane();
		tablePane1=new TablePane(data1,header);
		tablePane2=new TablePane(data2,header);
		tablePane3=new TablePane(data3,header);
		//��tablePane�Ĳ��ֹ�������Ϊ��Ƭ����
		tablePane.setLayout(tableCard);
		//������м�����������
		tablePane.add("",tablePane0);
		tablePane.add("�����1��",tablePane1);
		tablePane.add("�����2��",tablePane2);
		tablePane.add("����1��",tablePane3);
		//�����ָ���壬�ָ��Ϊˮƽ�ָ�ػ����棬�󴰸��treePane���Ҵ����tablePane
		splitPane=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,true,treePane,tablePane);
		setContentPane(splitPane);//���������ɵķָ����Ϊ���ڵ��������
		setSize(600,200);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
		new SplitDemo();
	}

class TreePane extends JPanel implements TreeSelectionListener  //�����������
	{
    	JTree tree;
    	DefaultTreeModel treeModel;
  		DefaultMutableTreeNode root;
   		DefaultMutableTreeNode node1;
   		DefaultMutableTreeNode node2;
   		DefaultMutableTreeNode leafnode11;
  		DefaultMutableTreeNode leafnode12;
   		DefaultMutableTreeNode leafnode21;
   		DefaultMutableTreeNode leafnode22;
    	TreePane()
    	{//������ģ�ʹ�����
    		DefaultMutableTreeNode root=new DefaultMutableTreeNode("רҵ");
    		treeModel=new DefaultTreeModel(root);
     		DefaultMutableTreeNode node1=new DefaultMutableTreeNode("�����Ӧ��");
     		DefaultMutableTreeNode node2=new DefaultMutableTreeNode("���缼��");
     		treeModel.insertNodeInto(node1,root,root.getChildCount());
     		treeModel.insertNodeInto(node2,root,root.getChildCount());

    		DefaultMutableTreeNode leafnode11=new DefaultMutableTreeNode("�����1��");
    		DefaultMutableTreeNode leafnode12=new DefaultMutableTreeNode("�����2��");
     		treeModel.insertNodeInto(leafnode11,node1,node1.getChildCount());
     		treeModel.insertNodeInto(leafnode12,node1,node1.getChildCount());
     		DefaultMutableTreeNode leafnode21=new DefaultMutableTreeNode("����1��");
     		treeModel.insertNodeInto(leafnode21,node2,node2.getChildCount());
 
    		tree=new JTree(treeModel);
    		tree.addTreeSelectionListener(this);//Ϊ��ע����ѡ���¼�������
    		tree.setRowHeight(20);//���������и�
    		JScrollPane scrollPane=new JScrollPane();
    		scrollPane.setViewportView(tree); 
    		this.add(scrollPane);   		
    	}
    	public void valueChanged(TreeSelectionEvent e)
    	{
    		JTree tree=(JTree)e.getSource();
    		DefaultMutableTreeNode selectedNode=(DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
			try{

			if(selectedNode.toString().equals("�����1��"))
				 tableCard.show(tablePane,"�����1��");
			else if(selectedNode.toString().equals("�����2��"))
				 tableCard.show(tablePane,"�����2��");
			else if(selectedNode.toString().equals("����1��"))
				 tableCard.show(tablePane,"����1��");
			}catch(Exception exp){}
    	} 	
    }
class TablePane extends JPanel   //�����������
{
	JTable table;
	TablePane()
	{
		super();
	}
	TablePane(Object[][] data,String[] header)
	{
		table=new JTable(data,header);
		table.setGridColor(Color.BLUE);//����������ɫ
		table.setRowHeight(20);//�����и�
		JScrollPane jsp=new JScrollPane(table);
		this.add(jsp);
	}
}
}