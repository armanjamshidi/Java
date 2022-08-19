package session29;

public class MyLinkedList {

    private NodeCourse start;
    private NodeCourse end;
    
    public void findEnd(){

        end=start;
        while(end!=null && end.getNextNode()!=null){
            end=end.getNextNode();

        }

    }
    public void addNode(Course cr){// add to end of List
        NodeCourse newNode=new NodeCourse(cr, null);
        if(start==null){
            start=end=newNode;

        }else{
            end.setNextNode(newNode);
            end=newNode;
            
            
        }
        
        
        
        
        
        
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
