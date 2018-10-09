public class ThreadInfo{
	public static void main(String[] args){
		Thread[] threads=new Thread[4];
		ThreadGroup group=new ThreadGroup("MyThreadGroup");
		if(args.length>0){
			Thread thread=Thread.currentThread();
			thread.setName(args[0]);
		}
		for(int i=0;i<4;i++)
		   threads[i]=new Thread(group,"MyThreads"+i);
	       ThreadInfo.printAllThreadInfo();	
	}
	public static void printAllThreadInfo(){
		ThreadGroup parent,root;
		root=parent=Thread.currentThread().getThreadGroup();
		while(parent=parent.getParent())!=null)
	    	root=parent;
			System.out.print();
			printThreadGroupInfo("",root));
	}
    public static void printThreadGroupInfo(String indent,ThreadGroup group){
       if(group==null)
           return;
       System.out.println(indent+"THREAD GROUP:"+group.getName()+";Max Priority:"+group.getMaxPriority()+(group.isDaemon()?"[Daemon]":""));	
       int no_of_threads=group.activeCount();
       Thread[] threads=new Thread[no_of_threads];
       no_of_threads=group.enumerate(threads,false);
       for(int i=0;i<no_of_threads;i++)
       	 printThreadInfo(indent+"",threads[i]);
       int no_of_groups=group.activeGroupCount();
       ThreadGroup[] groups=new ThreadGroup[no_of_groups];
       no_of_groups=group.enumerate(groups,false);
       for(int i=0;i<no_of_groups;i++)	 
       
       
    	
    	
    }	
	
	
}