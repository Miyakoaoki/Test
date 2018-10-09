//SplitDemo.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.table.*;
import javax.swing.event.*;
public class SplitDemo extends JFrame
{
    JSplitPane splitPane;     //定义分割面板
    CardLayout tableCard=new CardLayout(); //创建卡片布局
    JPanel tablePane=new JPanel();         //定义面板
	TablePane tablePane0,tablePane1,tablePane2,tablePane3;//定义表格面板组件
	String[] header={"学号","姓名","性别","出生日期","班级"};
   	Object[][] data1={
		{new Integer(1),"刘丽","女","1988-8-1","计算机1班"},
		{new Integer(2),"李亮","男","1987-10-13","计算机1班"},
		{new Integer(3),"田力","男","1988-3-5","计算机1班"}};
		Object[][] data2={
		{new Integer(1),"苏阳阳","女","1987-12-9","计算机2班"},
		{new Integer(2),"赵一秋","女","1988-6-23","计算机2班"}};
		Object[][] data3={
		{new Integer(1),"张杨","男","1986-10-19","网络1班"},
		{new Integer(2),"付静","女","1987-9-23","网络1班"}};
		
	SplitDemo()
	{
		//使用自定义的树面板类创建树面板
		TreePane treePane=new TreePane();
		//使用自定义的表格面板类创建表格面板
		tablePane0=new TablePane();
		tablePane1=new TablePane(data1,header);
		tablePane2=new TablePane(data2,header);
		tablePane3=new TablePane(data3,header);
		//将tablePane的布局管理器置为卡片布局
		tablePane.setLayout(tableCard);
		//向面板中加入表格面板组件
		tablePane.add("",tablePane0);
		tablePane.add("计算机1班",tablePane1);
		tablePane.add("计算机2班",tablePane2);
		tablePane.add("网络1班",tablePane3);
		//创建分割面板，分割方法为水平分割，重画界面，左窗格放treePane，右窗格放tablePane
		splitPane=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,true,treePane,tablePane);
		setContentPane(splitPane);//设置新生成的分割面板为窗口的内容面板
		setSize(600,200);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
		new SplitDemo();
	}

class TreePane extends JPanel implements TreeSelectionListener  //定义树面板类
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
    	{//利用树模型创建树
    		DefaultMutableTreeNode root=new DefaultMutableTreeNode("专业");
    		treeModel=new DefaultTreeModel(root);
     		DefaultMutableTreeNode node1=new DefaultMutableTreeNode("计算机应用");
     		DefaultMutableTreeNode node2=new DefaultMutableTreeNode("网络技术");
     		treeModel.insertNodeInto(node1,root,root.getChildCount());
     		treeModel.insertNodeInto(node2,root,root.getChildCount());

    		DefaultMutableTreeNode leafnode11=new DefaultMutableTreeNode("计算机1班");
    		DefaultMutableTreeNode leafnode12=new DefaultMutableTreeNode("计算机2班");
     		treeModel.insertNodeInto(leafnode11,node1,node1.getChildCount());
     		treeModel.insertNodeInto(leafnode12,node1,node1.getChildCount());
     		DefaultMutableTreeNode leafnode21=new DefaultMutableTreeNode("网络1班");
     		treeModel.insertNodeInto(leafnode21,node2,node2.getChildCount());
 
    		tree=new JTree(treeModel);
    		tree.addTreeSelectionListener(this);//为树注册树选择事件监听器
    		tree.setRowHeight(20);//设置树的行高
    		JScrollPane scrollPane=new JScrollPane();
    		scrollPane.setViewportView(tree); 
    		this.add(scrollPane);   		
    	}
    	public void valueChanged(TreeSelectionEvent e)
    	{
    		JTree tree=(JTree)e.getSource();
    		DefaultMutableTreeNode selectedNode=(DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
			try{

			if(selectedNode.toString().equals("计算机1班"))
				 tableCard.show(tablePane,"计算机1班");
			else if(selectedNode.toString().equals("计算机2班"))
				 tableCard.show(tablePane,"计算机2班");
			else if(selectedNode.toString().equals("网络1班"))
				 tableCard.show(tablePane,"网络1班");
			}catch(Exception exp){}
    	} 	
    }
class TablePane extends JPanel   //定义表格面板类
{
	JTable table;
	TablePane()
	{
		super();
	}
	TablePane(Object[][] data,String[] header)
	{
		table=new JTable(data,header);
		table.setGridColor(Color.BLUE);//设置网格颜色
		table.setRowHeight(20);//设置行高
		JScrollPane jsp=new JScrollPane(table);
		this.add(jsp);
	}
}
}